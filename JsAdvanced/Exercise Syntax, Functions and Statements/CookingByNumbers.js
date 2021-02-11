function solve(number, op1, op2, op3, op4, op5){
    let numb = Number(number);
    let operationArray = [op1, op2, op3, op4, op5];

    for (let i = 0; i < operationArray.length; i++) {
        numb = operations( numb, operationArray[i]);
        console.log(numb);
    }

    function operations (number, operation){
        if(operation == 'chop'){
            return number / 2;
        }else if(operation == 'dice'){
            return Math.sqrt(numb);
        }else if(operation == 'spice'){
            return number + 1;
        }else if(operation == 'bake'){
            return number * 3;
        }else if(operation == 'fillet'){
            return number * 0.8;
        }
    }
}

//solve('32', 'chop', 'chop', 'chop', 'chop', 'chop');
solve('9', 'dice', 'spice', 'chop', 'bake', 'fillet');