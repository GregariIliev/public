function solve() {
    let s1;
    let s2;
    let res;
    return {
        init: (selector1, selector2, resultSelector) => {
            s1 = document.querySelector(selector1);
            s2 = document.querySelector(selector2);
            res = document.querySelector(resultSelector);
        },
        add: () => {
            s1 = document.querySelector(s1).value;
            s2 = document.querySelector(s2).value;
            res.value = Number(s1) + Number(s2);
        },
        subtract: () => {
            s1 = document.querySelector(s1).value;
            s2 = document.querySelector(s2).value;
            res.value = Number(s1) - Number(s2);
        }
    }
}