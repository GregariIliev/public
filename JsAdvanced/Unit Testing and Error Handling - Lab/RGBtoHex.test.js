function rgbToHexColor(red, green, blue) {
    if (!Number.isInteger(red) || (red < 0) || (red > 255)){
        return undefined; // Red value is invalid
    }
    if (!Number.isInteger(green) || (green < 0) || (green > 255)){
        return undefined; // Green value is invalid
    }
    if (!Number.isInteger(blue) || (blue < 0) || (blue > 255)){
        return undefined; // Blue value is invalid
    }
    return "#" +
        ("0" + red.toString(16).toUpperCase()).slice(-2) +
        ("0" + green.toString(16).toUpperCase()).slice(-2) +
        ("0" + blue.toString(16).toUpperCase()).slice(-2);
}

let {assert} = require('chai');

describe('rgbColors', function () {
    it('should correct values', function () {
        assert.equal(rgbToHexColor(100,100,100), '#646464');
    });
    it('should black color', function () {
        assert.equal(rgbToHexColor(0,0,0), '#000000');
    });
    it('should white color', function () {
        assert.equal(rgbToHexColor(255,255,255), '#FFFFFF');
    });
    it('should invalid string input', function () {
        assert.isUndefined(rgbToHexColor('100', '100', '100'));
    });
    it('should red color', function () {
        assert.equal(rgbToHexColor(255,0,0), '#FF0000');
    });
    it('should green color', function () {
        assert.equal(rgbToHexColor(0,255,0), '#00FF00');
    });
    it('should blue color', function () {
        assert.equal(rgbToHexColor(0,0,255), '#0000FF');
    });
    it('should return undefined whit higher argument value', function () {
        assert.isUndefined(rgbToHexColor(255, 255,256));
    });
    it('should return undefined whit lower argument value', function () {
        assert.isUndefined(rgbToHexColor(255, 255,-1));
    });
    it('should return undefined whit empty arguments', function () {
        assert.isUndefined(rgbToHexColor());
    });
});