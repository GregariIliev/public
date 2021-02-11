function rectangle(width, height, color) {
    let rect = {};

    rect['width'] = width;
    rect['height'] = height;
    rect['color'] = color[0].toUpperCase() + color.slice(1);
    rect['calcArea'] = function () {
        return width * height;
    }
    return rect;
}

let rect = rectangle(4, 5, 'red');
console.log(rect.width);
console.log(rect.height);
console.log(rect.color);
console.log(rect.calcArea());
