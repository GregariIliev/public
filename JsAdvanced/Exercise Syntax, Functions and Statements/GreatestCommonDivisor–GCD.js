function solve(a, b){

    let commonDivisor = 0;

    for (let i = 1; i < a; i++) {
        if (a % i == 0 && b % i == 0 ){
            commonDivisor = i;
        }
    }

    console.log(commonDivisor);
}

solve(15, 5);