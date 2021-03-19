package math.problems;

import org.testng.Assert;

public class TestUnitTesting {
    public static void main(String[] args) {

        UnitTestingMath cal = new UnitTestingMath();

        int additionResult = cal.addition(10,90);
        Assert.assertEquals(100, additionResult);

        int subtractionResult = cal.subtraction(1000,900);
        Assert.assertEquals(100, subtractionResult);

        int multiplicationResult = cal.multiplication(100,90);
        Assert.assertEquals(9000, multiplicationResult);

        int divisionResult = cal.division(300,3);
        Assert.assertEquals(100, divisionResult);

    }
}
