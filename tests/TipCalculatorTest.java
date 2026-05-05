import static org.junit.jupiter.api.Assertions.*;

public class TipCalculatorTest {

    @org.junit.jupiter.api.Test
    void TipTest1(){
        TipCalculator tip1 = new TipCalculator();
        double tipAmount = tip1.calculateTip(100,20);
        assertEquals(20.00, tipAmount);
    }

    @org.junit.jupiter.api.Test
    void TipTest2(){
        TipCalculator tip1 = new TipCalculator();
        double tipAmount = tip1.calculateTip(27.05,18);
        assertEquals(4.87, tipAmount);
    }

    @org.junit.jupiter.api.Test
    void TipTest3(){
        TipCalculator tip1 = new TipCalculator();
        double tipAmount = tip1.calculateTip(1128.02,37);
        assertEquals(417.37, tipAmount);
    }


}
