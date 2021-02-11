function attachEventsListeners() {

    let buttons = Array.from(document.querySelectorAll('[type=button]'));
    let input = Array.from(document.querySelectorAll('input[type=text]'));
    for (const button of buttons) {
       button.addEventListener('click', onClick);
    }

    function onClick(ev){
        let quantity = Number(ev.target.parentNode.children[1].value);
        let id = ev.target.parentNode.children[0].textContent.trim();
        let valid = quantity >= 0;

        if (valid && id === 'Days:'){
            document.getElementById('hours').value = quantity * 24
            document.getElementById('minutes').value = quantity * 1440
            document.getElementById('seconds').value = quantity * 86400
        }else if (valid && id === 'Hours:'){
            document.getElementById('days').value = quantity / 24
            document.getElementById('minutes').value = quantity * 60
            document.getElementById('seconds').value = quantity * 3600
        }else if (valid && id === 'Minutes:'){
            document.getElementById('days').value = quantity / (24 * 60)
            document.getElementById('hours').value = quantity / 60
            document.getElementById('seconds').value = quantity * 60
        }else if (valid && id === 'Seconds:'){
            document.getElementById('days').value = quantity / 86400
            document.getElementById('hours').value = quantity / 3600
            document.getElementById('minutes').value = quantity / 60
        }

    }
}