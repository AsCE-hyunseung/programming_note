const assert = require('assert');

function solution(N) {
  const bin = N.toString(2);// 2진수 변환
  const binArray = bin.split('');// 단어 하나씩 자르기
  let zeroCount = 0;
  let gapMax = 0;

  binArray.forEach((element) => {
    if (element === '0') {// gapCount
      zeroCount += 1;
    } else {
      if (zeroCount > gapMax) {// 기존의 gap보다 현재의 gap이 더 크면
        gapMax = zeroCount;
      }
      zeroCount = 0;// 초기화하고 다시 loop
    }
  });

  return gapMax;
}

describe('Test Suite', () => {
  it('case 1', () => {
    assert.equal(2, solution(9));
  });
  it('case 2', () => {
    assert.equal(4, solution(529));
  });
  it('case 3', () => {
    assert.equal(1, solution(20));
  });
});
