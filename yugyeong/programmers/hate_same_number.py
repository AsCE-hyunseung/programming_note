import unittest


def solution(arr):
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