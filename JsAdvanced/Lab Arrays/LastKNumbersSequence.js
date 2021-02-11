function solve(lengthArray, previousElements){
    let result = [1];

    for (let i = 0; i < lengthArray - 1; i++) {
        let iterations = previousElements;
        let index = i;
        let sum = 0;
        while(iterations-- > 0 && index >= 0){
            sum += result[index--];
        }
        result.push(sum);
    }
   return result;
}

solve(6, 3);
solve(8, 2);

//[1, 1, 2, 4, 7, 13]