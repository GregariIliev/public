function generateReport() {
    let boxes = Array.from(document.querySelectorAll('thead>tr>th'));
    let tableBody = Array.from(document.querySelectorAll('tbody>tr'));

    let result = [];

    for (let i = 0; i < boxes.length; i++) {
        if (boxes[i].children[0].checked === true) {
            result.push(i)
        }
    }
    let output = [];
    for (let i = 0; i < tableBody.length; i++) {
        let map = {};
        for (let j = 0; j < result.length; j++) {
            let name = boxes[result[j]].textContent.toLowerCase().trim();
            let value = tableBody[i].children[result[j]].textContent;
            map[name] = value;
        }
       output.push(map)
    }
    document.querySelector('textarea').value = JSON.stringify(output);
}