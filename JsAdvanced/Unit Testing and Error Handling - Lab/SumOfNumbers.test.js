let sum = require('./SumOfNumbers');
let assert = require('chai').assert;
let {expect} = require('chai');


describe('sumFunctionTest', () =>{
    it('correctSumArrayOfNumbers', () =>{
        expect(sum([1,2])).to.equal(3);
    });

    it('incorrectSumArrayOfNotANumbers', () =>{
        expect(sum([1])).to.equal(1);
    });

    it('should sum numbers of string',  () =>{
        expect(sum([2,3,4])).to.equal(9);
    });
});