function solve(arr){
    let sortArray = arr.sort((a,b) => a - b);
    let result = sortArray.splice(0, 2);

    console.log(result.join(' '));
}
solve([30, 15, 50, 5]);
solve([3, 0, 10, 4, 7, 3]);