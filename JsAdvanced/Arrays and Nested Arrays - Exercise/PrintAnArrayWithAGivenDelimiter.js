function solve(arr, delimiter){
    let result = arr.join(delimiter);
    console.log(result);
}

solve(['One',
        'Two',
        'Three',
        'Four',
        'Five'],
    '-'
);

solve(['How about no?',
        'I',
        'will',
        'not',
        'do',
        'it!'],
    '_'
);