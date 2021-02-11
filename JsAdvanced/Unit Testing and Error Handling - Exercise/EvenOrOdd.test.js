let assert = require('chai').assert;

function isOddOrEven(string) {
    if (typeof(string) !== 'string') {
        return undefined;
    }
    if (string.length % 2 === 0) {
        return "even";
    }

    return "odd";
}

describe('test isOddOrEven', function () {

    it('should return undefined whit invalid input arguments of number', function () {
        assert.isUndefined(isOddOrEven(2));
    });
    it('should return undefined whit invalid input arguments of boolean', function () {
        assert.isUndefined(isOddOrEven(true));
    });
    it('should return even whit valid string argument', function () {
        assert.equal(isOddOrEven('1234'), 'even');
    });
    it('should return even whit valid string argument', function () {
        assert.equal(isOddOrEven('12345'), 'odd');
    });
    it('should return even whit valid string argument', function () {
        assert.equal(isOddOrEven('1234' , 'asd'), 'even');
    });
});