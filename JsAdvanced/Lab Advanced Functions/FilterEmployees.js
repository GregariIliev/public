function solve(input, criteriaInput){
    let person = JSON.parse(input);
    let tokensCriteria = criteriaInput.split('-');

    let criteria = tokensCriteria[0];
    let value = tokensCriteria[1];

    let count = 0;
    for (const p of person) {
        if (criteria === 'all'){
            console.log(`${count++}. ${p['first_name']} ${p['last_name']} - ${p['email']}`)
        }else if (p[criteria] === value){
            console.log(`${count++}. ${p['first_name']} ${p['last_name']} - ${p['email']}`)
        }
    }
}
let criteria = 'gender-Female';
let input = `[{"id": "1","first_name": "Ardine","last_name": "Bassam","email": "abassam0@cnn.com","gender": "Female"}, {"id": "2","first_name": "Kizzee","last_name": "Jost","email": "kjost1@forbes.com","gender": "Female"},{"id": "3","first_name": "Evanne","last_name": "Maldin","email": "emaldin2@hostgator.com","gender": "Male"}]`;

solve(input, criteria);
