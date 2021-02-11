function encodeAndDecodeMessages() {
    let divs = Array.from(document.getElementById('main').children);
    let receiver = divs[1];
    console.log(receiver)

    document.querySelectorAll('button')[0].addEventListener('click', function (ev) {
        let text = ev.target.parentNode.querySelector('textarea');
        let encodeText = '';
        for (const char of text.value) {
            encodeText += String.fromCharCode(char.charCodeAt(0) + 1);
        }
        receiver.querySelector('textarea').textContent = encodeText;
        text.value = '';
    });

    document.querySelectorAll('button')[1].addEventListener('click', function (ev){
        let text = receiver.querySelector('textarea')
        let decodeText = '';
        for (const char of text.textContent) {
            decodeText += String.fromCharCode(char.charCodeAt(0) - 1);
        }
        text.textContent = decodeText;
    });
}