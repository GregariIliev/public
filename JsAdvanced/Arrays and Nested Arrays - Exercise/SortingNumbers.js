function solve(arr){
    let result = [];

    let sortedArray = arr.sort(((a, b) => a - b));

    while (sortedArray.length){
        result.push(sortedArray.shift());
        result.push(sortedArray.pop());
    }

    return result;
}


console.log(solve([1, 65, 3, 52, 48, 63, 31, -3, 18, 56]));