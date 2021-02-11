function solve(input){
    let result = [];

    result = input.reduce((arr, hero) => {
        let objHero = {};
        let [name, level, ...items] = hero.split(' / ');
        objHero.name = name;
        objHero.level = Number(level);
        if (items != 0){
            objHero.items = items[0].split(', ');
        }else {
            objHero.items = [];
        }

        arr.push(objHero);
        return arr;
    },[]);
    return JSON.stringify(result);
}

console.log(solve(['Isacc / 25 / Apple, GravityGun',
    'Derek / 12 / BarrelVest, DestructionSword',
    'Hes / 1 ']
));