function lockedProfile() {
    let buttons = Array.from(document.querySelectorAll("button"));
    for (const button of buttons) {
        button.addEventListener("click",onClick);
    }
    function onClick (event){
        let radioButton = event.target.parentNode.querySelectorAll('input')[1];
        if (radioButton.checked){
            let hiddenInfo = radioButton.parentNode.querySelector('div');
            if (hiddenInfo.style.display === ''){
                hiddenInfo.style.display = 'block';
                radioButton.parentNode.querySelector('button').textContent = 'Hide it';
            }else {
                hiddenInfo.style.display = '';
                radioButton.parentNode.querySelector('button').textContent = 'Show more';
            }
        }

    }

}