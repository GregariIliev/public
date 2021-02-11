function calc() {
    // TODO: sum = num1 + num2

    let firstNumb = Number(document.querySelector('#num1').value);
    let secondNumb = Number(document.querySelector('#num2').value);

    let resultRef = document.getElementById('sum');

    resultRef.value = firstNumb + secondNumb;
}
