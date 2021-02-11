class Circle{
    constructor(radius) {
        this._radius = radius;
    }

    get radius(){
        this._diameter = this._radius * 2;
        return this._radius;
    }
    get diameter(){
        return this._diameter;
    }
    set diameter(value){
        this._diameter = value;
        this._radius = this._diameter / 2;
    }
    get area(){
        this._area = Math.PI * this._radius * this._radius;
        return this._area;
    }
}




let c = new Circle(5);
c.diameter = 1.6;
console.log(`Radius: ${c.radius}`);
console.log(`Diameter: ${c.diameter}`);
console.log(`Area: ${c.area}`);
console.log(`Radius: ${c.radius}`);
console.log(`Diameter: ${c.diameter}`);
console.log(`Area: ${c.area}`);

