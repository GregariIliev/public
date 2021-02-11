function validate() {
    let input = document.querySelector('#email');
    input.addEventListener('change', onChange);

    let regex = new RegExp('[a-z]+@[a-z]+\\.[a-z]+');

    function onChange(ev){
        let email = ev.target.value;
        if (email.match(regex)){
            input.removeAttribute('class')
            // ev.target.className = '';
        }else {
            input.setAttribute('class', 'error')
            //ev.target.className = 'error';
        }
    }
}