function addItem() {
    let newList = document.createElement('li');
    newList.textContent = document.querySelector('#newItemText').value;

    document.querySelector('ul').appendChild(newList);

    let button = document.createElement('button');
    button.textContent = '[Delete]'
    newList.appendChild(button)
}