function solve(arr){
    let result = [];

    result = arr.reduce((acc, el, index) => {
        if (index % 2 === 1){
            acc.push(el * 2);
        }
        return acc
    },[]);

    return result.reverse();
}

console.log(solve([10, 15, 20, 25]));
console.log(solve([3, 0, 10, 4, 7, 3]));