import com.vav.TDD.Calculator;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

/**
 * Created by Vaibhav on 1/13/2017.
 */
public class CalculatorTest {
    Calculator calc;
    @Before
    public void createCalculator(){
         calc = new Calculator();
    }
    @Test
    public void testNewCalculatorHasAnAccumulatorOfZero(){
        assertEquals(BigDecimal.ZERO,calc.getAccumulator());
    }
    @Test
    public void testSettingAccumulatorValue(){
        BigDecimal value = BigDecimal.valueOf(20);
        calc.setAccumulator(value);
        assertEquals(value, calc.getAccumulator());
    }
    @Test
    public void testEnteringAndDroppingValues(){

    }
}
