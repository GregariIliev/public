function subtract() {
    let firstNumb = Number(document.getElementById('firstNumber').value);
    let secondNumb = Number(document.getElementById('secondNumber').value);
    document.getElementById('result').textContent = firstNumb - secondNumb;
}