"""
문제 : 같은 숫자는 싫어

배열 arr가 주어집니다.
배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다.
이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다.
배열 arr에서 제거 되고 남은 수들을 return 하는 solution 함수를 완성해 주세요.
단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다.

예를들면
arr = [1, 1, 3, 3, 0, 1, 1] 이면 [1, 3, 0, 1] 을 return 합니다.
arr = [4, 4, 4, 3, 3] 이면 [4, 3] 을 return 합니다.
배열 arr에서 연속적으로 나타나는 숫자는 제거하고 남은 수들을 return 하는 solution 함수를 완성해 주세요.
"""

import unittest


def solution(arr):
    """
    0. 배열 answer 선언
    1. arr 반복
    1-1. answer가 빈 배열이라면 arr 첫번째 원소 넣기
    1-2. 아니라면 answer의 마지막 원소와 arr 원소 비교
    1-2-1. 마지막 원소와 arr 원소가 다른 경우 answer에 원소 추가
    2. answer 반환
    """
    answer = []

    for a in arr:
        if not answer:
            answer.append(a)
            continue
        if answer[-1] != a:
            answer.append(a)
    return answer


class Test(unittest.TestCase):
    def test_solution(self):
        self.assertEqual([1, 3, 0, 1], solution([1, 1, 3, 3, 0, 1, 1]))
        self.assertEqual([4, 3], solution([4, 4, 4, 3, 3]))


if __name__ == '__main__':
    unittest.main()