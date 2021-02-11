function solve(arr){
    let result = [];

    result = arr.reduce((acc, el, index) => {
        if (el === 'add'){
            acc.push(index + 1);
        }else if (el === 'remove'){
            acc.pop();
        }
        return acc;
    },[]);

    if (result.length == 0){
        return 'Empty';
    }
    return result.join('\n');
}

console.log(solve(['add',
    'add',
    'add',
    'add']
));

console.log(solve(['add',
    'add',
    'remove',
    'add',
    'add']
));

console.log(solve(['remove',
    'remove',
    'remove']
));