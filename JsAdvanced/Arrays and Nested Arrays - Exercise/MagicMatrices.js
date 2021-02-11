function solve(matrix){

    let magicNumber = 0;

    for (let col = 0; col < matrix[0].length; col++) {
        magicNumber += matrix[0][col];
    }

    for (let row = 0; row < matrix.length; row++) {
        let currentNumberRow = 0;
        let currentNumberCol = 0;
        for (let col = 0; col < matrix.length; col++) {
            currentNumberRow += matrix[row][col];
            currentNumberCol += matrix[col][row];
        }
        if (currentNumberRow != magicNumber || currentNumberCol != magicNumber){
            return false;
        }
    }

    return true;
}

console.log(solve([[4, 5, 6],
    [6, 5, 4],
    [5, 5, 5]]
));

console.log(solve([[11, 32, 45],
    [21, 0, 1],
    [21, 1, 1]]
));

console.log(solve([[1, 0, 0],
    [0, 0, 1],
    [0, 1, 0]]
));