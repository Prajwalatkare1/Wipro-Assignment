document.addEventListener('DOMContentLoaded', () => {
    const initBtn = document.getElementById('initBtn');
    const addBtn = document.getElementById('addBtn');
    const removeBtn = document.getElementById('removeBtn');
    const insertBtn = document.getElementById('insertBtn');
    const customerDisplay = document.getElementById('customerDisplay');
    const operationLog = document.getElementById('operationLog');

    let customers = [];

    // Helper functions
    function logOperation(message, type = 'info') {
        const logEntry = document.createElement('div');
        logEntry.className = `log-entry ${type}`;
        logEntry.textContent = `[${new Date().toLocaleTimeString()}] ${message}`;
        operationLog.appendChild(logEntry);
        operationLog.scrollTop = operationLog.scrollHeight;
    }

    function displayCustomers() {
        customerDisplay.innerHTML = '';
        customers.forEach((customer, index) => {
            const customerElement = document.createElement('div');
            customerElement.className = 'customer-item';
            customerElement.innerHTML = `
                <span>${customer}</span>
                <span class="customer-id">ID: ${index}</span>
            `;
            customerDisplay.appendChild(customerElement);
        });
    }

    // Event handlers
    initBtn.addEventListener('click', () => {
        const count = parseInt(prompt('How many customers to register?'));
         return;

        customers = [];
        for (let i = 0; i < count; i++) {
            const name = prompt(`Enter name for customer ${i + 1}:`);
            if (name) customers.push(name);
        }

        displayCustomers();
        logOperation(`Initialized with ${count} customers`, 'info');
    });

    addBtn.addEventListener('click', () => {
        const name = prompt('Enter customer name to add:');
        if (!name) return;

        customers.push(name);
        displayCustomers();
        logOperation(`Added customer: ${name}`, 'success');
    });

    removeBtn.addEventListener('click', () => {
        if (customers.length === 0) {
            logOperation('No customers to remove', 'warning');
            return;
        }

        const removed = customers.pop();
        displayCustomers();
        logOperation(`Removed customer: ${removed}`, 'warning');
    });

    insertBtn.addEventListener('click', () => {
        if (customers.length === 0) {
            logOperation('Initialize customers first', 'warning');
            return;
        }

        const position = parseInt(prompt(`Enter position (0-${customers.length - 1}):`));
        if (isNaN(position) || position < 0 || position >= customers.length) {
            logOperation('Invalid position', 'warning');
            return;
        }

        const name = prompt('Enter customer name to insert:');
        if (!name) return;

        customers.splice(position, 0, name);
        displayCustomers();
        logOperation(`Inserted ${name} at position ${position}`, 'info');
    });

    // Initial log message
    logOperation('System ready. Click "Initialize Customers" to begin.', 'info');
});