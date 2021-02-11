function solve(town, people, rich){
    let obj = {};

    obj.name = town;
    obj.population = people;
    obj.treasury  = rich;

    return obj;
}

console.log(solve('Tortuga',
    7000,
    15000
));

console.log(solve('Santo Domingo',
    12000,
    23500
));