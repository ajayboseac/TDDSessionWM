
import com.walmart.game.Boundaries;
import com.walmart.game.GameScore;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;


public class CalculatorTest {


    @Test
    public void shouldbeAbletoAddTwoNumbers(){

        Caclulator calc = new Caclulator();
        int sum =calc.add(2,3);
        assertEquals(5,sum);
        assertEquals(6,calc.add(3,3));
    }
}
