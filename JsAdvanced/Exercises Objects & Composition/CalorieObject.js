function solve(input){
    let result = {};

    input.forEach((el, index) => {
        if (index % 2 == 0){
            result[el] = Number(input[index+1]);
        }
    });

    // for (let i = 0; i < input.length; i+=2) {
    //     let product = input[i];
    //     let calories = Number(input[i+1]);
    //     result[product] = calories;
    // }

    console.log(result);
}

solve(['Yoghurt', '48', 'Rise', '138', 'Apple', '52']);
solve(['Potato', '93', 'Skyr', '63', 'Cucumber', '18', 'Milk', '42']);