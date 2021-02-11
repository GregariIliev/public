function focus() {
    let allInputs = Array.from(document.querySelectorAll('input'));
        allInputs.forEach(e => {
        e.addEventListener('focus', onFocus);
        e.addEventListener('blur', onBlur);
    });


    function onFocus(ev){
        ev.target.parentNode.className = 'focused';
    }

    function onBlur(ev){
        ev.target.parentNode.className = '';
    }
}