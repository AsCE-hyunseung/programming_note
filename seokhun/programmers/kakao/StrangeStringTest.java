import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StrangeStringTest {
    StrangeString s = new StrangeString();
    String str = "  try hello world";
    String result = "  TrY HeLlO WoRlD";

    @Test
    public void solution() {
        assertEquals(result, s.solution(str));
    }
}