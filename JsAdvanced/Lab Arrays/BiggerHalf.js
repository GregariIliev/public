function solve(arr){
        let sortArray = arr.sort((a,b) => a - b);
        let arrayHalfIndex = sortArray.length / 2;

        return sortArray.splice(arrayHalfIndex);
}

console.log(solve([4, 7, 2, 5]))