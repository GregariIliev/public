function solve(arr, startIndex, endIndex) {
    startIndex < 0 ? startIndex = 0 : startIndex;
    endIndex > arr.length ? endIndex = arr.length : endIndex;
    if (Array.isArray(arr)) {
        arr = arr.slice(startIndex, endIndex + 1)
            .reduce((acc, el) => acc + Number(el),0);
        return Number(arr.toFixed(2));
    }else {
        return NaN;
    }
}

console.log(solve([10, 20, 30, 40, 50, 60], 3, 300));
console.log(solve([1.1, 2.2, 3.3, 4.4, 5.5], -3, 1))
console.log(solve([10, 'twenty', 30, 40], 0, 2))
console.log(solve([], 1, 2))
console.log(solve('text', 0, 2))