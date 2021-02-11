let secondZeroTest = solution();

secondZeroTest.append('123');
secondZeroTest.append('45');
secondZeroTest.removeStart(2);
secondZeroTest.removeEnd(1);
secondZeroTest.print();


function solution() {
    let result = '';
    return {
        append: (string) => {
            result += string;
        },
        removeStart: (n) => {
            result = result.slice(n);
        },
        removeEnd: (n) => {
            let arr = result.split('');
            for (let i = 0; i < n; i++) {
                arr.pop();
            }
            result = arr.join('');
        },
        print: () => {
            console.log(result);
        }
    }
}