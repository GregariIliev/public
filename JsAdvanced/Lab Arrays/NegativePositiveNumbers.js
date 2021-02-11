function solve(arr){
    let arrayResult = [];

    for(const i in arr) {
       if(arr[i] >= 0){
           arrayResult.push(arr[i]);
       }else {
           arrayResult.unshift(arr[i]);
       }
    }
    for (const i in arrayResult) {
        console.log(arrayResult[i]);
    }
}

solve([7, -2, 8, 9]);
solve([3, -2, 0, -1]);