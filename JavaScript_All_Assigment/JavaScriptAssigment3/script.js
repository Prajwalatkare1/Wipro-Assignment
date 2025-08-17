document.addEventListener('DOMContentLoaded', () => {
  const value1Input = document.getElementById('value1');
  const value2Input = document.getElementById('value2');
  const type1Display = document.getElementById('type1');
  const type2Display = document.getElementById('type2');
  const checkButton = document.getElementById('checkButton');
  const resultsSection = document.getElementById('results');
  const resultsContainer = document.getElementById('resultsContainer');

  // Update type displays as user types
  value1Input.addEventListener('input', updateTypeDisplays);
  value2Input.addEventListener('input', updateTypeDisplays);
  
  // Compare values when button is clicked
  checkButton.addEventListener('click', compareValues);

  function updateTypeDisplays() {
    type1Display.textContent = `Type: ${getType(value1Input.value)}`;
    type2Display.textContent = `Type: ${getType(value2Input.value)}`;
  }

  function getType(value) {
    if (value === '') return 'undefined';
    if (value === 'true' || value === 'false') return 'boolean';
    if (!isNaN(value) && value.trim() !== '') return 'number';
    return 'string';
  }

  function compareValues() {
    const value1 = value1Input.value;
    const value2 = value2Input.value;
    
    // Clear previous results
    resultsContainer.innerHTML = '';
    
    // Show results section
    resultsSection.style.display = 'block';
    
    // Create comparison cards
    createComparisonCard(
      'Loose Equality (==)', 
      value1 == value2, 
      'Compares values after type coercion'
    );
    
    createComparisonCard(
      'Strict Equality (===)', 
      value1 === value2, 
      'Compares values AND types (no coercion)'
    );
    
    createComparisonCard(
      'Loose Inequality (!=)', 
      value1 != value2, 
      'True if values are different after coercion'
    );
    
    createComparisonCard(
      'Strict Inequality (!==)', 
      value1 !== value2, 
      'True if values OR types are different'
    );
  }

  function createComparisonCard(title, result, explanation) {
    const card = document.createElement('div');
    card.className = 'comparison-card';
    
    const titleElement = document.createElement('div');
    titleElement.className = 'comparison-title';
    titleElement.textContent = title;
    
    const resultElement = document.createElement('div');
    resultElement.className = 'comparison-result';
    resultElement.innerHTML = result ? 
      `<span class="true">true</span>` : 
      `<span class="false">false</span>`;
    
    const explanationElement = document.createElement('div');
    explanationElement.className = 'explanation';
    explanationElement.textContent = explanation;
    
    card.appendChild(titleElement);
    card.appendChild(resultElement);
    card.appendChild(explanationElement);
    
    resultsContainer.appendChild(card);
  }
});