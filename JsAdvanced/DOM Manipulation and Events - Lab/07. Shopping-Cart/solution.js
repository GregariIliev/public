function solve() {
    let buttons = Array.from(document.querySelectorAll('.add-product'));
    for (const button of buttons) {
        button.addEventListener('click', add);
    }
    document.querySelector('.checkout').addEventListener('click', checkOut);
    let textArea = document.querySelector('textarea');
    let output = {};

    function add(ev) {
        if (ev.target.className === 'add-product') {
            let name = ev.target.parentNode.parentNode.children[1].children[0].textContent;
            let price = Number(ev.target.parentNode.parentNode.children[3].textContent);
            textArea.textContent += `Added ${name} for ${price.toFixed(2)} to the cart.\n`;
            if (!output[name]) {
                output[name] = 0;
            }
            output[name] += price
        }
    }

    function checkOut() {
        let products = Object.keys(output);
        let prices = Object.values(output);
        let totalSum = 0;
        for (const price of prices) {
            totalSum += price;
        }
        textArea.textContent += `You bought ${products.join(', ')} for ${totalSum.toFixed(2)}.`
        for (const button of buttons) {
            button.removeEventListener('click', add)
        }
        document.querySelector('.checkout').removeEventListener('click', checkOut);
    }
}