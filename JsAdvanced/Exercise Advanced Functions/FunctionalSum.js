function add(n){
    let result = 0 + n;
     function func(num){
        result += num;
        return func;
    }
    func.toString = () => " "+result;
    return func;
}
console.log(
    add(1)(6)(-3));
