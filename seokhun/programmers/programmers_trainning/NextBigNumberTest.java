
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/*다음 큰 숫자
문제 설명
자연수 n이 주어졌을 때, n의 다음 큰 숫자는 다음과 같이 정의 합니다.

조건 1. n의 다음 큰 숫자는 n보다 큰 자연수 입니다.
조건 2. n의 다음 큰 숫자와 n은 2진수로 변환했을 때 1의 갯수가 같습니다.
조건 3. n의 다음 큰 숫자는 조건 1, 2를 만족하는 수 중 가장 작은 수 입니다.
예를 들어서 78(1001110)의 다음 큰 숫자는 83(1010011)입니다.

자연수 n이 매개변수로 주어질 때, n의 다음 큰 숫자를 return 하는 solution 함수를 완성해주세요.

제한 사항
n은 1,000,000 이하의 자연수 입니다.
입출력 예
n	result
78	83
15	23
입출력 예 설명
입출력 예#1
문제 예시와 같습니다.
입출력 예#2
15(1111)의 다음 큰 숫자는 23(10111)입니다.

의사코드 작성
1. 숫자를 입력받음 -> 입력받은 수를 2진수로 변환 -> 비교할 수를 위해 +1을 해줌, ->2진수로 변환
2. 두 수들의 1의 갯수를 셈 -> 갯수가 다르면 +1
3. 갯수가 같으면 그 수가 정답 -> 다시 10진수로 변환*/

//10 -> 2진수로 변환
// String binaryNum = Integer.toBinaryString(n);

//2 -> 10진수로 변환
//Inter.parseInt(변환할 값, 변환 할 값의 진수(ex : 2 -> 2진수란 뜻)
public class NextBigNumberTest {

    @Test
    public void 십진수를_이진수로_변환(){
        NextBigNumber nb = new NextBigNumber();
        assertEquals("1111",nb.checkBinary(15)); //15
        assertEquals("1001110",nb.checkBinary(78));
    }
    @Test
    public void 이진수로_변환된_값의_1의개수_카운트(){
        NextBigNumber nb = new NextBigNumber();
        assertEquals(4,nb.countIntOne("1111")); //15
        assertEquals(1,nb.countIntOne("10000")); //16
        assertEquals(2,nb.countIntOne("10001")); //17
        assertEquals(2,nb.countIntOne("10010")); //18
        assertEquals(3,nb.countIntOne("10011")); //19
        assertEquals(2,nb.countIntOne("10100")); //20
        assertEquals(3,nb.countIntOne("10101")); //21
        assertEquals(3,nb.countIntOne("10110")); //22
        assertEquals(4,nb.countIntOne("10111")); //23

    }

    @Test
    public void 카운트결과가_같으면_그_수를_리턴(){
        NextBigNumber nb = new NextBigNumber();
        assertEquals(23,nb.solution(15));
        assertEquals(83,nb.solution(78));
    }
}
