function sumTable() {
    let table = Array.from(document.querySelector('tbody').children);

    let sum = 0;
    for (let i = 1; i < table.length - 1; i++) {
        sum += Number(table[i].children[table[i].children.length - 1].textContent)
    }
    document.getElementById('sum').textContent = sum;
}