function isSymmetric(arr) {
    if (!Array.isArray(arr)){
        return false; // Non-arrays are non-symmetric
    }
    let reversed = arr.slice(0).reverse(); // Clone and reverse
    let equal = (JSON.stringify(arr) == JSON.stringify(reversed));
    return equal;
}
let {assert} = require('chai');
describe('Symetric Function', function () {
    it('should symetric array', function () {
        assert.isTrue(isSymmetric([3,3]))
    });
    it('should non-symetric array', function () {
        assert.isFalse(isSymmetric([1,2]));
    });
    it('should input is array', function () {
        assert.isTrue(isSymmetric([]));
    });
    it('should input is not array', function () {
        assert.isFalse(isSymmetric(3));
    });
    it('should non symmetric array whit not parsed numbers', function () {
        assert.isFalse(isSymmetric(['1',1]));
    });
    it('should symmetric array whit strings', function () {
        assert.isTrue(isSymmetric(['a','a']));
    });
    it('should symmetric array whit odd length', function () {
        assert.isTrue(isSymmetric([1,1,1]))
    });
    it('should non symmetric array whit odd length', function () {
        assert.isFalse(isSymmetric([2,3,5]))
    });
});
