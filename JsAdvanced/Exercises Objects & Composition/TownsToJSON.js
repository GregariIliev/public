function solve(input) {
    let result = [];

    let arrayTokens = input.reduce((arr, el) => {
        let tokens = el.slice(2, el.length - 2).split(' | ');
        for (let i = 1; i < tokens.length; i++) {
            if (!isNaN(Number(tokens[i]))){
                tokens[i] = Number(Number(tokens[i]).toFixed(2));
            }
        }
        arr.push(tokens);
        return arr;
    },[]);

    let[keys, ...values] = arrayTokens;

    for (let i = 0; i < values.length; i++) {
        let obj = {};
        for (let j = 0; j < keys.length; j++) {
            obj[keys[j]] = values[i][j];
        }
        result.push(obj);
    }
    return JSON.stringify(result);
}


console.log(solve(['| Town | Latitude | Longitude |',
    '| Sofia | 42.696552 | 23.32601 |',
    '| Beijing | 39.913818 | 116.363625 |']
));


console.log(solve(['| Town | Latitude | Longitude |',
'| Random Town | 0.00 | 0.00 |']))