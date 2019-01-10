import org.junit.Test;
import static org.junit.Assert.*;
 
public class StickTest {
    Stick s=new Stick();
    
    @Test
    public void 테스트_결과() {
        assertEquals(17,s.solution("()(((()())(())()))(())"));
    }
}