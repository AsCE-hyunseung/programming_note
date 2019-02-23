import org.junit.Test;

import static org.junit.Assert.assertEquals;


/*124 나라의 숫자
문제 설명
124 나라가 있습니다. 124 나라에서는 10진법이 아닌 다음과 같은 자신들만의 규칙으로 수를 표현합니다.

124 나라에는 자연수만 존재합니다.
124 나라에는 모든 수를 표현할 때 1, 2, 4만 사용합니다.
예를 들어서 124 나라에서 사용하는 숫자는 다음과 같이 변환됩니다.

10진법	124 나라	10진법	124 나라
1	1	6	14  11  44  16  122
2	2	7	21  12  111 17  124
3	4	8	22  13  112 18  141
4	11	9	24  14  114 19  142
5	12	10	41  15  121 20  144
자연수 n이 매개변수로 주어질 때, n을 124 나라에서 사용하는 숫자로 바꾼 값을
return 하도록 solution 함수를 완성해 주세요.

제한사항
n은 500,000,000이하의 자연수 입니다.
입출력 예
n	result
1	1
2	2
3	4
4	11

의사코드 작성
- 1,2,4 로만 이루어짐
반복주기가 3
자연수 입력 값이랑은 어떻게 연결시킬까 ?
3이니까 마지막 자리 수는 n을 나눈 나머지 값이 들어오고
1,2,4를 몫 만큼 돌려볼까?
이렇게 하면 몇바퀴를 돌릴지, 몇번째 자리의 값을 가져올지 나올 듯
*/
public class CountryNumberTest {

    @Test
    public void 숫자123을_결과124로_표현(){
        CountryNumber c = new CountryNumber();
        assertEquals("1",c.solution(1));
        assertEquals("2",c.solution(2));
        assertEquals("4",c.solution(3));
    }

    @Test
    public void 숫자456_두자리의_124로_표현(){
        CountryNumber c = new CountryNumber();
        assertEquals("11",c.solution(4));
        assertEquals("12",c.solution(5));
        assertEquals("14",c.solution(6));
    }
}
