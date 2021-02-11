function extractText() {
    let text = Array.from(document.querySelectorAll('#items li'));

    let result = document.getElementById('result');
    text.forEach(e => result.value += e.textContent + '\n');
}