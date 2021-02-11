class List{
    constructor() {
        this.list = [];
        this.size = 0;
    }

    add(element){
        this.list.push(element);
        this.size++;
        this.list = this.list.sort((a,b) => a-b);
    }
    remove(index){
        if (index < 0 || index > this.list.length - 1){
            throw new Error('Error')
        }
        this.size--;
        this.list.splice(index, 1);
    }
    get(index){
        if (index < 0 || index > this.list.length - 1){
            throw new Error('Error')
        }
        return this.list[index]
    }
}

let list = new List();
for (let i = 0; i < 10; i++) {
    list.add(i)
}
list.remove(9)
console.log(list)

