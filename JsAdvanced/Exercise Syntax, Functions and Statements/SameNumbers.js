function solve(input){
    let text = String(input);

    let sum = 0;
    let bool = false;

    for (let i = 0; i < text.length; i++) {
        sum += Number(text.charAt(i));
        if(text.charAt(i) != text.charAt(0)){
            bool = true;
        }
    
    }
    if (bool){
        console.log(false);
    }else {
        console.log(true);
    }
    console.log(sum);
}

solve(2222222);
solve(1234);