function  solution(){
    let robotStorage = {
        protein: 0,
        carbohydrate: 0,
        fat: 0,
        flavour: 0
    };
    let recipes = {
        apple: {carbohydrate: 1, flavour: 2},
        lemonade: {carbohydrate: 10, flavour: 20},
        burger: {carbohydrate: 5, fat: 7, flavour: 3},
        eggs: {protein: 5, fat: 1, flavour: 1},
        turkey: {protein: 10, carbohydrate: 10, fat: 10, flavour: 10}
    };

    return (commandAndValue) => {
        let tokens = commandAndValue.split(' ');
        if (tokens.length > 1) {
            let [command, ...args] = tokens;
            let map = {
                restock: () => {
                    if (robotStorage[args[0]] >= 0) {
                        robotStorage[args[0]] += Number(args[1]);
                    }
                    return `Success`;
                },
                prepare: () => {
                    let food = args[0];
                    let quantity = Number(args[1]);
                    let neededElements = Object.entries(recipes[food]).map(e => [e[0], e[1] * quantity]);
                    let cockedSuccess;
                    for (const el of neededElements) {
                        if (robotStorage[el[0]] >= el[1]){
                            cockedSuccess = true;
                        }else {
                            return throw Error(`Error: not enough ${el[0]} in stock `)
                        }
                    }
                    cockedSuccess === true ? neededElements.forEach(e => robotStorage[e[0]] -= e[1]) : cockedSuccess = false;
                }
            }
            return map[command]();
        }else if (tokens[0] === 'report'){
            return `protein=${robotStorage.protein} carbohydrate=${robotStorage.carbohydrate} fat=${robotStorage.fat} flavour=${robotStorage.flavour}`;
        }
    }
}

let manager = solution();
manager('prepare turkey 1');
manager('restock protein 10');
manager('prepare turkey 1');
manager('restock carbohydrate 10');
manager('prepare turkey 1');
manager('restock fat 10');
manager('prepare turkey 1');
manager('restock flavour 10');
manager('prepare turkey 1');
manager('report');

