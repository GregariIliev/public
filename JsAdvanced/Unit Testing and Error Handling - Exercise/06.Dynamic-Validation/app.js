function validate() {
    let regex = new RegExp('[a-z+]+@[a-z]+\\.[a-z]+');

    let email = document.querySelector('input');
    email.addEventListener('change', () => {
        if (regex.test(email.value)){
            email.removeAttribute('class')
            console.log(2)
        }else {
          email.classList.add('style', 'error')
        }
    })
}