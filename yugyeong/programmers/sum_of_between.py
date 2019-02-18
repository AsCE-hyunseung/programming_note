import unittest


def swap(a, b):
    return b, a


def solution(a, b):
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
