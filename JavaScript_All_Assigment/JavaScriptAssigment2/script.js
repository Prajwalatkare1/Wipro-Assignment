document.addEventListener('DOMContentLoaded', () => {
  const taxForm = document.getElementById('taxForm');
  const outputDiv = document.getElementById('output');
  
  // Tax slabs for new regime (FY 2023-24)
  const taxSlabs = [
    { limit: 300000, rate: 0 },
    { limit: 600000, rate: 0.05 },
    { limit: 900000, rate: 0.10 },
    { limit: 1200000, rate: 0.15 },
    { limit: 1500000, rate: 0.20 },
    { limit: Infinity, rate: 0.30 }
  ];

  taxForm.addEventListener('submit', (e) => {
    e.preventDefault();
    
    if (!validateForm()) return;
    
    const formData = getFormData();
    const taxDetails = calculateTax(formData.income);
    
    displayResults(formData, taxDetails);
  });

  function validateForm() {
    let isValid = true;
    
    // Validate Name
    const name = document.getElementById('fullName').value.trim();
    const nameError = document.getElementById('nameError');
    if (name.length < 3) {
      nameError.textContent = 'Please enter a valid name (min 3 characters)';
      isValid = false;
    } else {
      nameError.textContent = '';
    }
    
    // Validate PAN
    const pan = document.getElementById('panNumber').value.trim().toUpperCase();
    const panError = document.getElementById('panError');
    const panRegex = /^[A-Z]{5}[0-9]{4}[A-Z]{1}$/;
    if (!panRegex.test(pan)) {
      panError.textContent = 'Please enter a valid PAN (format: AAAAA9999A)';
      isValid = false;
    } else {
      panError.textContent = '';
    }
    
    // Validate DOB
    const dob = document.getElementById('dob').value;
    const dobError = document.getElementById('dobError');
    if (!dob) {
      dobError.textContent = 'Please select your date of birth';
      isValid = false;
    } else {
      const birthDate = new Date(dob);
      const today = new Date();
      if (birthDate >= today) {
        dobError.textContent = 'Date of birth must be in the past';
        isValid = false;
      } else {
        dobError.textContent = '';
      }
    }
    
    // Validate Income
    const income = parseFloat(document.getElementById('income').value);
    const incomeError = document.getElementById('incomeError');
    if (isNaN(income) || income < 0) {
      incomeError.textContent = 'Please enter a valid income amount';
      isValid = false;
    } else {
      incomeError.textContent = '';
    }
    
    return isValid;
  }

  function getFormData() {
    const dob = new Date(document.getElementById('dob').value);
    const today = new Date();
    let age = today.getFullYear() - dob.getFullYear();
    const monthDiff = today.getMonth() - dob.getMonth();
    
    if (monthDiff < 0 || (monthDiff === 0 && today.getDate() < dob.getDate())) {
      age--;
    }
    
    return {
      name: document.getElementById('fullName').value.trim(),
      pan: document.getElementById('panNumber').value.trim().toUpperCase(),
      age: age,
      income: parseFloat(document.getElementById('income').value)
    };
  }

  function calculateTax(income) {
    let remainingIncome = income;
    let totalTax = 0;
    let previousLimit = 0;
    
    for (const slab of taxSlabs) {
      if (remainingIncome <= 0) break;
      
      const taxableAmount = Math.min(remainingIncome, slab.limit - previousLimit);
      const taxForSlab = taxableAmount * slab.rate;
      
      totalTax += taxForSlab;
      remainingIncome -= taxableAmount;
      previousLimit = slab.limit;
    }
    
    // Round to nearest rupee
    totalTax = Math.round(totalTax);
    const effectiveRate = (totalTax / income) * 100;
    
    return {
      tax: totalTax,
      effectiveRate: effectiveRate.toFixed(2)
    };
  }

  function displayResults(formData, taxDetails) {
    document.getElementById('resultName').textContent = formData.name;
    document.getElementById('resultPan').textContent = formData.pan;
    document.getElementById('resultAge').textContent = `${formData.age} years`;
    document.getElementById('resultIncome').textContent = `₹${formData.income.toLocaleString('en-IN')}`;
    document.getElementById('resultTax').textContent = `₹${taxDetails.tax.toLocaleString('en-IN')}`;
    document.getElementById('resultRate').textContent = `${taxDetails.effectiveRate}%`;
    
    outputDiv.hidden = false;
    outputDiv.scrollIntoView({ behavior: 'smooth' });
  }
});