"""
문제 설명
An array A consisting of N integers is given. Rotation of the array means that each element is shifted right by one index, and the last element of the array is moved to the first place. For example, the rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7] (elements are shifted right by one index and 6 is moved to the first place).

The goal is to rotate array A K times; that is, each element of A will be shifted to the right K times.

Write a function:

def solution(A, K)

that, given an array A consisting of N integers and an integer K, returns the array A rotated K times.

For example, given

    A = [3, 8, 9, 7, 6]
    K = 3
the function should return [9, 7, 6, 3, 8]. Three rotations were made:

    [3, 8, 9, 7, 6] -> [6, 3, 8, 9, 7]
    [6, 3, 8, 9, 7] -> [7, 6, 3, 8, 9]
    [7, 6, 3, 8, 9] -> [9, 7, 6, 3, 8]
For another example, given

    A = [0, 0, 0]
    K = 1
the function should return [0, 0, 0]

Given

    A = [1, 2, 3, 4]
    K = 4
the function should return [1, 2, 3, 4]

Assume that:

N and K are integers within the range [0..100];
each element of array A is an integer within the range [−1,000..1,000].
"""

import unittest


def solution(A, K):
    # 1. A가 빈 리스트라면 A를 반환한다.
    if len(A) == 0:
        return A
    # 2. A를 K만큼 반복한다.
    for i in range(K):
        # 3. 마지막 숫자를 꺼내어 첫번째 인덱스에 추가한다.
        A.insert(0, A.pop())
    # 4. A를 반환한다.
    return A


class Test(unittest.TestCase):
    def test_solution(self):
        self.assertEqual([9, 7, 6, 3, 8], solution([3, 8, 9, 7, 6], 3))
        self.assertEqual([0, 0, 0], solution([0, 0, 0], 1))
        self.assertEqual([1, 2, 3, 4], solution([1, 2, 3, 4], 4))


if __name__ == '__main__':
    unittest.main()
