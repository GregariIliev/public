function solve(input){
    let result = '';

    let townObj = {};

    for (const elements of input) {
        let [townName, product, price] = elements.split(' | ');

        price = Number(price);

        if (townObj[product] === undefined){
            townObj[product] = [price, townName];

        }else if (Object.keys(townObj).includes(product) && townObj[product][0] > price) {
            townObj[product] = [price, townName];
        }
    }
    for (const townObjElement in townObj) {
        console.log(`${townObjElement} -> ${townObj[townObjElement][0]} (${townObj[townObjElement][1]})`);
    }
    console.log(result);
}

solve(['Sofia City | Audi | 100000',
'Sofia City | BMW | 100000',
'Sofia City | Mitsubishi | 10000',
'Sofia City | Mercedes | 10000',
'Sofia City | NoOffenseToCarLovers | 0',
'Mexico City | Audi | 1000',
'Mexico City | BMW | 99999',
'New York City | Mitsubishi | 10000',
'New York City | Mitsubishi | 1000',
'Mexico City | Audi | 100000',
'Washington City | Mercedes | 1000']);