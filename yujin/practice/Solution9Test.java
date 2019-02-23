package practice;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution9Test {

    @Test
    public void 김씨를_잘_찾는지() {
        Solution9 s = new Solution9();
        String[] seoul={"Kim"};
        assertEquals("김서방은 0에 있다", s.solution(seoul));
    }

    @Test
    public void 배열에서도_김씨를_잘_찾는지() {
        Solution9 s = new Solution9();
        String[] seoul={"you","Kim"};
        assertEquals("김서방은 1에 있다", s.solution(seoul));
    }

    @Test
    public void 스트링_출력을_잘_하는지() {
        Solution9 s = new Solution9();
        String[] seoul={"you","Kim"};
        String[] seoul2={"yu","jin","Kim"};
        assertEquals("김서방은 1에 있다", s.solution(seoul));
        assertEquals("김서방은 2에 있다", s.solution(seoul2));
    }
}