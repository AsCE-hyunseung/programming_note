"""
문제 설명
대문자와 소문자가 섞여있는 문자열 s가 주어집니다.
s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를 return 하는 solution를 완성하세요.
'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다.
단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.

예를들어 s가 pPoooyY면 true를 return하고 Pyy라면 false를 return합니다.

제한사항
문자열 s의 길이 : 50 이하의 자연수
문자열 s는 알파벳으로만 이루어져 있습니다.

1. 문자열 lower
2. p와 y의 개수 세기
3. p와 y의 개수 비교하기
3-1. 같으면 True 리턴
3-2. 다르면 False 리턴
"""
import unittest


def solution(s):
    return s.lower().count('p') == s.lower().count('y')


class Test(unittest.TestCase):
    def test_solution(self):
        self.assertTrue(solution("pPoooyY"))
        self.assertFalse(solution("Pyy"))

if __name__ == '__main__':
    unittest.main()