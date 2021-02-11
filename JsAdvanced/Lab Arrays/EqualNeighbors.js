function solve(matrix){
    let result = 0;

    for (let row = 0; row < matrix.length; row++) {
        for (let col = 0; col < matrix[row].length; col++) {
            if (row + 1 < matrix.length){
                if (matrix[row + 1][col] == matrix[row][col]){
                    result++;
                }
            }
            if (col + 1 < matrix[row].length){
                if (matrix[row][col + 1] == matrix[row][col]){
                    result++;
                }
            }
        }
    }

    return result;
}


console.log(solve([['2', '2', '5', '7', '4'],
    ['4', '0', '5', '3', '4'],
    ['2', '5', '5', '4', '2']]
));
