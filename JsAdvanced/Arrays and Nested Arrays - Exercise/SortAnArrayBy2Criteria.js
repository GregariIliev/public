function solve(arr){

    let sortedArray = arr.sort(((a, b) => {
        if (a.length - b.length == 0){
            return a.localeCompare(b);
        }
        return a.length - b.length;
    }));

    for (let i = 0; i < sortedArray.length; i++) {
        console.log(sortedArray[i]);
    }
}

solve(['alpha',
    'beta',
    'gamma']
);
console.log();
solve(['Isacc',
    'Theodor',
    'Jack',
    'Harrison',
    'George']
);
console.log();


solve(['test',
    'Deny',
    'omen',
    'Default']
);