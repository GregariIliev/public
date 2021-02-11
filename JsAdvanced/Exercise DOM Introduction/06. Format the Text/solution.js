function solve() {
    //TODO

    let text = document.querySelector('#input').value.split('\.').filter(p => p.length > 0);
    let output = document.querySelector('#output');

    for (let i = 0; i < text.length; i += 3) {
        let arr = [];
        for (let y = 0; y < 3; y++) {
            if (text[i + y]) {
                arr.push(text[i + y]);
            }
        }
        let paragraph = arr.join('.') + '.';
        let p = document.createElement('p');
        p.textContent = paragraph;
        output.appendChild(p);
    }
}


