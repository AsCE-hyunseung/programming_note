const assert = require('assert');

function solution(num) {
  let number = num;
  let count = 0;

  while (number > 1) {
    if (number % 2 === 0) { // 짝수
      number /= 2;
    } else { // 홀수
      number = number * 3 + 1;
    }
    count += 1;
    if (count === 500) { // 예외처리
      count = -1;
      break;
    }
  }

  return count;
}

describe('Test Suite', () => {
  it('case 1', () => {
    assert.equal(solution(6), 8);
  });
  it('case 2 ', () => {
    assert.equal(solution(16), 4);
  });
  it('case 3', () => {
    assert.equal(solution(626331), -1);
  });
});
