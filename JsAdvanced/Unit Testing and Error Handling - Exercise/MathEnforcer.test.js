let assert = require('chai').assert;
let mathEnforcer = {
    addFive: function (num) {
        if (typeof(num) !== 'number') {
            return undefined;
        }
        return num + 5;
    },
    subtractTen: function (num) {
        if (typeof(num) !== 'number') {
            return undefined;
        }
        return num - 10;
    },
    sum: function (num1, num2) {
        if (typeof(num1) !== 'number' || typeof(num2) !== 'number') {
            return undefined;
        }
        return num1 + num2;
    }
};

describe('mathEnforcer', function () {
    it('should test addFive', function () {
        assert.isUndefined(mathEnforcer.addFive('d'));
        assert.equal(mathEnforcer.addFive(0), 5);
        assert.equal(mathEnforcer.addFive(1), 6);
        assert.equal(mathEnforcer.addFive(-5), 0);
        assert.equal(mathEnforcer.addFive(-5.5), -0.5);
    });
    it('should test subtract', function () {
        assert.isUndefined(mathEnforcer.subtractTen('a'));
        assert.equal(mathEnforcer.subtractTen(10), 0);
        assert.equal(mathEnforcer.subtractTen(-10), -20);
        assert.equal(mathEnforcer.subtractTen(-10.1), -20.1);
    });
    it('should test sum', function () {
        assert.isUndefined(mathEnforcer.sum('1', 2));
        assert.isUndefined(mathEnforcer.sum(1, '2'));
        assert.isUndefined(mathEnforcer.sum('1', '2'));
        assert.equal(mathEnforcer.sum(1,1) , 2);
        assert.equal(mathEnforcer.sum(1,1.2) , 2.2);
        assert.closeTo(1,1.2, 0.2);
    });
});