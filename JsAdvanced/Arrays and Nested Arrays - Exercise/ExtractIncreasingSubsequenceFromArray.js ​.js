function solve(arr){
    let result = [];

    result = arr.reduce((acc, el, index) => {
        if (arr[++index] >= el){
            acc.push(arr[index]);
        }
        return acc;

    },[]);result.unshift(arr[0]);
    return result;
}
console.log(solve([1,
    3,
    8,
    4,
    10,
    12,
    3,
    2,
    24]
));