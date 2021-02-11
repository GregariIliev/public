function addItem() {

    let newList = document.createElement('li');
    newList.textContent = document.querySelector('#newItemText').value;

    document.querySelector('ul').appendChild(newList);

}