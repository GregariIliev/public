function solve(matrix){
    let result = [];

    let firstDiagonal = 0;
    let secondDiagonal = 0;

    for (let i = 0; i < matrix.length; i++) {
        for (let j = i; j < matrix[i].length; j++) {
            firstDiagonal += matrix[i][j];
            break;
        }
    }

    let index = 0;

    for (let i = matrix.length - 1; i >= 0; i--) {
        for (let j = index; j < matrix[i].length; j++) {
            secondDiagonal += matrix[i][j];
            index++;
            break;
        }
    }

    result.push(firstDiagonal);
    result.push(secondDiagonal);

    console.log(result.join(' '));
}


solve([[20, 40],
    [10, 60]]
);


solve([[3, 5, 17],
    [-1, 7, 14],
    [1, -8, 89]]
);