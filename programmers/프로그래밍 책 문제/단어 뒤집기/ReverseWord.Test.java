import org.junit.Test;
import static org.junit.Assert.*;
 
public class ReverseWordTest {
    ReverseWord r=new ReverseWord();
    
    @Test
    public void 테스트_결과() {
        assertEquals("try. no is there not. do or Do",r.solution("Do or do not. there is no try."));
    }
}