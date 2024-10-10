import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExampleExceptionTest {

    /**
     * Test data for positive test.
     *
     * @return test data array
     */
    @DataProvider(name = "data")
    public static Object[][] data() {
        return new Object[][]{
                {2, 2, 4},
                {2, 3, 6}
                // TODO add 2 more test data here
        };
    }

    /**
     * Test data for exception test.
     *
     * @return test data array
     */
    @DataProvider(name = "negativeData")
    public static Object[][] negativeData() {
        return new Object[][]{
                {-2, 2},
                {2, -2}
                // TODO add 2 more test data here
        };
    }

    @Test(dataProvider = "data")
    public void testRectangleArea(int a, int b, int c) {
        // TODO put your code here
    }


    @Test(dataProvider = "negativeData")
    public void testRectangleAreaNegative(int a, int b) {
        // TODO put your code here
    }
}