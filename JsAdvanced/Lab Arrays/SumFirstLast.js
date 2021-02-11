function solve(arr){
    let sum = 0;

    sum += Number(arr[0]) +  (Number(arr[arr.length - 1]));

    console.log(sum);
}

solve(['20', '30', '40']);
solve(['5', '10']);