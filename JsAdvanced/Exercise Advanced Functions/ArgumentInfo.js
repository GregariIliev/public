function solve(...arguments){
    let arg = Array.from(arguments);
    let countType = {};

    for (const element of arg) {
        let type = typeof element;
        console.log(`${type}: ${element}`);
        if (!countType[type]){
            countType[type] = 0;
        }
        countType[type] += 1;
    }
    let countTypeEntries = Object.entries(countType);
    countTypeEntries.sort((arr1, arr2) => {
        return arr2[1] - arr1[1];
    }).forEach(e => console.log(`${e[0]} = ${e[1]}`))
}

solve({ name: 'bob'}, 3.333, 9.999);