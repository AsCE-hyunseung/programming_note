"""
문제 : 두 정수 사이의 합

두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.
"""

import unittest


def swap(a, b):
    return b, a


def solution(a, b):
    """
    0. answer 선언
    1. a와 b의 크기 비교
    1-1. a가 b보다 크다면 swap
    2. a와 b 사이의 숫자 개수만큼 반복
    2-1. a에 반복자 i를 더해주며 sum
    """
    answer = 0

    if a > b:
        a, b = swap(a, b)

    for i in range(b-a+1):
        answer += a+i

    return answer


class Test(unittest.TestCase):
    def test_swap(self):
        self.assertEqual((3, 5), swap(5, 3))

    def test_solution(self):
        self.assertEqual(12, solution(3, 5))
        self.assertEqual(3, solution(3, 3))
        self.assertEqual(12, solution(5, 3))


if __name__ == '__main__':
    unittest.main()
