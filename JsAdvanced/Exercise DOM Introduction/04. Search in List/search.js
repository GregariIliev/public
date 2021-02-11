function search() {
    let town = document.querySelectorAll('#towns>li');
    let searchedText = document.querySelector('input').value;
    let result = document.querySelector('#result');

    let foundTowns = 0;
    for (const townElement of town) {
        if (townElement.textContent.includes(searchedText)){
            townElement.style.fontWeight = 'bold'
            townElement.style.textDecoration = 'underline'
            foundTowns++;
        }else {
            townElement.style.fontWeight = '';
            townElement.style.textDecoration = '';
        }
    }

    result.textContent = `${foundTowns} matches found`;
}
