function solve(input){
    let obj = {};

    input.forEach(e => {
        let tokens = e.split(' <-> ');

        if (!obj[tokens[0]]){
            obj[tokens[0]] = Number(tokens[1]);
        }else {
            obj[tokens[0]] += Number(tokens[1]);
        }
    });
    for (const objKey in obj) {
        console.log(objKey + ' : ' + obj[objKey]);
    }
}

solve(['Istanbul <-> 100000',
    'Honk Kong <-> 2100004',
    'Jerusalem <-> 2352344',
    'Mexico City <-> 23401925',
    'Istanbul <-> 1000']
);