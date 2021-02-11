let assert = require('chai').assert;

function lookupChar(string, index) {
    if (typeof (string) !== 'string' || !Number.isInteger(index)) {
        return undefined;
    }
    if (string.length <= index || index < 0) {
        return "Incorrect index";
    }

    return string.charAt(index);
}

describe('test lookupChar', function () {
    let string = 'abcd';
    it('should return undefined with one invalid argument ', function () {
        assert.isUndefined(lookupChar(1, 1));
        assert.isUndefined(lookupChar('abc', 1.2));
        assert.isUndefined(lookupChar('3', '3'));
        assert.isUndefined(lookupChar(1 , '1'));
    });

    it('should return Incorrect index with index out ot bounds', function () {
        assert.equal(lookupChar('asd', 12), 'Incorrect index');
        assert.equal(lookupChar('asd', -12), 'Incorrect index');
    });

    it('should return correct value on index 0', function () {
        assert.equal(lookupChar('asd', 0), 'a');
        assert.equal(lookupChar('asd', 2), 'd');
    });
});