class Point{
    constructor(a,b) {
        this.a = a;
        this.b = b;
    }

    static distance(p1, p2){
        return Math.sqrt((p1.a - p2.a) ** 2 + (p2.b - p1.b) ** 2);
    }
}





let p1 = new Point(5, 5);
let p2 = new Point(9, 8);
console.log(Point.distance(p1, p2));
