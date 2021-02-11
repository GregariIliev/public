let createCalculator = require('./AddSubtract');
let {assert} = require('chai');

describe('createCalculator function test', function () {

    let a = createCalculator();

    beforeEach(function () {
        a = createCalculator();
    });

    it('initialized internal value correct', function () {
        assert.equal(a.get(), 0);
    });
    it('should add number to internal value ', function () {
        a.add(10);
        a.add(10);
        assert.equal(a.get(), 20);
    });
    it('should subtract number to internal value', function () {
        a.subtract(10);
        a.subtract(10);
        assert.equal(a.get(), -20);
    });
    it('should return undefined when add letter', function () {
        assert.isUndefined(a.add('s'));
    });
    it('should return undefined when subtract letter', function () {
        assert.isUndefined(a.subtract('s'));
    });
    it('should works whit number of string ', function () {
        a.add('10');
        assert.equal(a.get(), 10);
    });
    it('should return object', function () {
        assert.isObject(a);
    });
    it('should correct work methods', function () {
        a.add('10');
        a.subtract('-10')
        assert.equal(a.get(), 20)
    });
    it('should add and subtract floating point number', function () {
        a.add(1.1);
        a.subtract(1.1);
        assert.equal(a.get(), 0);
    });
});

