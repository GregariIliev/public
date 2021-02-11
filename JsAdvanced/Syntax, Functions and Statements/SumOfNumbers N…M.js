function sumNumbers(a, b){
    let firstNumb = Number(a);
    let secondNumb = Number(b);

    let sum = 0;

    for (let i = firstNumb; i <= secondNumb; i++) {
        sum += i;    
    }

    console.log(sum);
}