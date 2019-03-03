"""
문제 설명
A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones at both ends in the binary representation of N.

For example, number 9 has binary representation 1001 and contains a binary gap of length 2.

The number 529 has binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3.

The number 20 has binary representation 10100 and contains one binary gap of length 1.

The number 15 has binary representation 1111 and has no binary gaps.

The number 32 has binary representation 100000 and has no binary gaps.

Write a function:

def solution(N)

that, given a positive integer N, returns the length of its longest binary gap.

The function should return 0 if N doesn't contain a binary gap.

For example, given N = 1041 the function should return 5, because N has binary representation 10000010001 and so its longest binary gap is of length 5.

Given N = 32 the function should return 0, because N has binary representation '100000' and thus no binary gaps.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..2,147,483,647].
"""

import unittest


def solution(N):
    zero_count = 0
    zero_max = 0

    # 1. 십진수를 이진수로 바꾼다.
    # 2. 세 번째 이진수까지 슬라이싱한다. (두 번째 수까지는 쓸모 없고, 세 번째 숫자는 어차피 1이기 때문)
    # 3. 네 번째 이진수부터 체크한다.
    for n in bin(N)[3:]:
        # 3-1. 0일 경우 카운트를 올린다.
        if n == '0':
            zero_count += 1
        # 3-2. 1일 경우 카운트한 개수와 가장 큰 카운트 개수를 비교한다.
        else:
            # 3-2-1. 카운트한 개수가 더 크면, 가장 큰 카운트 개수를 변경한다.
            if zero_count > zero_max:
                zero_max = zero_count
            # 3-2-2. 카운트한 개수는 초기화한다.
            zero_count = 0
    # 4. 가장 큰 카운트 개수를 반환한다.
    return zero_max


class Test(unittest.TestCase):
    def test_solution(self):
        self.assertEqual(5, solution(1041))
        self.assertEqual(0, solution(32))
        self.assertEqual(1, solution(20))


if __name__ == '__main__':
    unittest.main()