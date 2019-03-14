const assert = require('assert');

function solution(A, K) {
  const shiftedArray = [];
  let shiftedIndex;

  A.forEach((element, index) => {
    shiftedIndex = (index + K) % A.length;// 오른쪽으로 shift
    shiftedArray[shiftedIndex] = A[index];
  });

  return shiftedArray;
}

describe('Test Suite', () => {
  it('case 1', () => {
    assert.deepEqual([9, 7, 6, 3, 8], solution([3, 8, 9, 7, 6], 3));
  });
  it('case 2', () => {
    assert.deepEqual([0, 0, 0], solution([0, 0, 0], 1));
  });
  it('case 3', () => {
    assert.deepEqual([1, 2, 3, 4], solution([1, 2, 3, 4], 4));
  });
});