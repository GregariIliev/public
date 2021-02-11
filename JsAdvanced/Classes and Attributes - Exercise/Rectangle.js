class Rectangle{
    constructor(width, height, color) {
        this.color = color.charAt(0).toUpperCase() + color.slice(1);
        this.width = width;
        this.height = height;
    }

    calcArea(){
        this.area = this.height * this.width;
        return this.area;
    }
}


let rect = new Rectangle(4, 5, 'red');
console.log(rect.width);
console.log(rect.height);
console.log(rect.color);
console.log(rect.calcArea());
