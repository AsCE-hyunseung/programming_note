package P7_완주하지못한선수;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class P7_0219Test {

    @Test
    public void 결과값출력() {
        P7_0219 s = new P7_0219();
        String participant1[] = {"leo", "kiki", "eden"};
        String participant2[] = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String participant3[] = {"mislav", "stanko", "mislav", "ana"};

        String completion1[] = {"eden", "kiki"};
        String completion2[] = {"marina", "josipa", "nikola", "filipa"};
        String completion3[] = {"stanko", "mislav", "ana"};


        assertEquals("leo", s.solution(participant1, completion1));
        assertEquals("vinko", s.solution(participant2, completion2));
        assertEquals("mislav", s.solution(participant3, completion3));

    }
}
