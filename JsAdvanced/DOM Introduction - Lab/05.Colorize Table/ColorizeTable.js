function colorize() {
    // TODO

    let elements = document.querySelectorAll('tr');

    for (let i = 0; i < elements.length; i+2) {
        if (i % 2 == 1){
            elements[i].style.backgroundColor = 'teal';
        }
    }
}