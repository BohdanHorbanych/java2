import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static java.lang.Double.NaN;
import static java.lang.Double.POSITIVE_INFINITY;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LambdaTest {

    @DataProvider(name = "max")
    public static Object[][] max() {
        return new Object[][]{
                {10.0, 5.0, 10.0},
                {-1.0, 10.0, 10.0},
                {0.0, 0.0, 0.0},
                {-10.0, NaN, NaN},
                {POSITIVE_INFINITY, 1e32, POSITIVE_INFINITY}
                // TODO add 2 more test data here
        };
    }

    @DataProvider(name = "sqrt")
    public static Object[][] sqrt() {
        return new Object[][]{
                {25.0, 5.0},
                {-1.0, NaN},
                {POSITIVE_INFINITY, POSITIVE_INFINITY}
                // TODO add 2 more test data here
        };
    }

    @Test(dataProvider = "max")
    public void testMax(Double a, Double b, Double c) {
        assertEquals(Lambda.getMax().apply(a, b), c, "Max value is incorrect");

        assertTrue(Lambda.getMax().getClass().getGenericInterfaces().length > 0,
                "getMax method should return Generic Functional Interface");

        assertTrue(Lambda.getMax().getClass().getGenericInterfaces()[0].getTypeName().contains("BiFunction"),
                "getMax method should return BiFunctional interface");
    }

    @Test(dataProvider = "sqrt")
    public void testSqrt(Double a, Double b) {
        assertEquals(Lambda.getSqrt().apply(a), b, "Square root is incorrect");

        assertTrue(Lambda.getMax().getClass().getGenericInterfaces().length > 0,
                "getMax method should return Generic Functional Interface");

        assertTrue(Lambda.getMax().getClass().getGenericInterfaces()[0].getTypeName().contains("Function"),
                "getMax method should return Functional interface");
    }
}