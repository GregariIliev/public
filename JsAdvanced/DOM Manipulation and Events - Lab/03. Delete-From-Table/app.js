function deleteByEmail() {
    let input = document.querySelector("input").value;
    let tableRow = Array.from(document.querySelectorAll("tbody tr"));
    let result = document.querySelector("#result")
    for (const row of tableRow) {
        let email = row.children[1].textContent;
        if (input === email){
            row.remove();
             result.textContent = "Deleted.";
        }else {
            result.textContent = "Not found."
        }
    }
}