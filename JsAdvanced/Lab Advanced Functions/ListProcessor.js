function solve(input){
    let collection = [];
    let regex = new RegExp('\\s+', 'g');
    let obj = {
        add: (str) =>{
            collection.push(str);
        },
        remove: (str) => {
            collection = collection.filter(e => e !== str);
        },
        print: () => {
            console.log(collection.join(','));
        }
    }

    for (const inputElement of input) {
        let tokens = inputElement.split(regex);
        if (tokens.length > 1){
            let func = tokens[0];
            let str = tokens[1];
            obj[func](str);
        }else {
            obj.print();
        }
    }
}

solve(['add    hello', 'add again', 'add hello', 'add again', 'print', 'add again', 'add again', 'remove again']);
solve(['add pesho', 'add george', 'add peter', 'remove peter','print'])