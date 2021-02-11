function getFibonator(){
    let num = 0;
    let num2 = 1;
    let result = num + num2;
    
    return () => {
        num = num2;
        num2 = result;
        result = num + num2
        return num
    }
}


let fib = getFibonator();
console.log(fib()); // 1
console.log(fib()); // 1
console.log(fib()); // 2
console.log(fib()); // 3
console.log(fib()); // 5
console.log(fib()); // 8
console.log(fib()); // 13
