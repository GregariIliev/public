function solve(input) {
    let map = {};

    let sortedArray = input.sort((l, r) => l.localeCompare(r));

    for (const elements of sortedArray) {
        let char = elements[0];

        if (!map[char]) {
            map[char] = [];
        }
        let [firstPart, secondPart] = elements.split(' :')
        firstPart = firstPart + ':';
        let arr = firstPart.concat(secondPart);
        map[char].push(arr)
    }

    let entries = Object.entries(map);

    for (const entry of entries) {
        console.log(entry[0]);
       entry[1].forEach(e => console.log('  ' + e))
    }
}

solve(['Appricot : 20.4',
    'Fridge : 1500',
    'TV : 1499',
    'Deodorant : 10',
    'Boiler : 300',
    'Apple : 1.25',
    'Anti-Bug Spray : 15',
    'T-Shirt : 10']
);