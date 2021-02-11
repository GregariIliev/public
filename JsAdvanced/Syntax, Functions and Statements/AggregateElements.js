function sum(arr){

    let sum = 0;
    let secondSum = 0;
    let thirdSum = '';

    for (let index = 0; index < arr.length; index++) {
       sum += arr[index];
       secondSum += 1/(arr[index]);
       thirdSum += arr[index];
    }
    console.log(sum);
    console.log(secondSum);
    console.log(thirdSum);
}

sum(2, 4, 8, 16);