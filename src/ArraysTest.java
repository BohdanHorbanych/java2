import java.util.Arrays;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ArraysTest {

    @DataProvider(name = "ArrayUtil")
    public static Object[][] arrays() {
        return new Object[][]{
                {
                        new String[]{"Python", "JAVA", "PHP", "C#", "C++", "SQL"},
                        new String[]{"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"},
                        new String[]{"JAVA", "SQL"}
                },
                {
                        new String[]{"here", "is", "some", "text", ".", "text"},
                        new String[]{"some", "text", "above", "."},
                        new String[]{"some", "text", "."}
                },
                {
                        new String[]{"apple", "banana", "cherry"},
                        new String[]{"banana", "apple", "kiwi"},
                        new String[]{"apple", "banana"}
                },
                {
                        new String[]{"blue", "green", "red"},
                        new String[]{"green", "yellow", "blue"},
                        new String[]{"green", "blue"}
                }
        };
    }

    @Test(dataProvider = "ArrayUtil")
    public void testFindCommon(String[] array1, String[] array2, String[] expectedResult) {
        String[] actualResult = ArrayUtil.findCommon(array1, array2);

        // Sort both arrays before comparison
        Arrays.sort(actualResult);
        Arrays.sort(expectedResult);

        assertEquals(actualResult, expectedResult, "Common elements are not correct");
    }
}
