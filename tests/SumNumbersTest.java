import static org.junit.jupiter.api.Assertions.*;

public class SumNumbersTest {

    @org.junit.jupiter.api.Test
    void EvenTest1(){
        SumNumbers n1 = new SumNumbers();
        int sumEven = n1.sumIsEven(1,1);
        assertEquals(1, sumEven);
    }

    @org.junit.jupiter.api.Test
    void EvenTest2(){
        SumNumbers n1 = new SumNumbers();
        int sumEven = n1.sumIsEven(1,2);
        assertEquals(0, sumEven);
    }

    @org.junit.jupiter.api.Test
    void EvenTest3(){
        SumNumbers n1 = new SumNumbers();
        int sumEven = n1.sumIsEven(2,2);
        assertEquals(1, sumEven);
    }


    @org.junit.jupiter.api.Test
    void EvenTest4(){
        SumNumbers n1 = new SumNumbers();
        int sumEven = n1.sumIsEven(3,2);
        assertEquals(0, sumEven);
    }


}
