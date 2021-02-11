function solve (array,number){
    for (let i = 0; i < number; i++) {
        let currentNumb = array.splice(array.length - 1, 1);
        array.splice(0, 0, currentNumb);
    }
    console.log(array.join(" "));
}
solve(['1',
        '2',
        '3',
        '4'],
    2
);
solve(['Banana',
        'Orange',
        'Coconut',
        'Apple'],
    15
);
