class Stringer{
    constructor(string, length) {
        this.innerString = string;
        this.innerLength = length;
    }
    increase(length){
        this.innerLength += length;
    }
    decrease(length){
        this.innerLength -= length;
        if (this.innerLength < 0){
            this.innerLength = 0
        }
    }

    toString(){
        if (this.innerLength < this.innerString.length){
            let string = this.innerString;
            return string.slice(0, this.innerLength) + '...';
        }
        return this.innerString;
    }
}
let test = new Stringer("Viktor", 6);
console.log(test.toString()); // Test

test.increase(3);
console.log(test.toString()); // Test
