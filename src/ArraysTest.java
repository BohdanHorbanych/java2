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
                        new String[]{"apple", "orange", "banana", "grape"},
                        new String[]{"banana", "melon", "apple", "kiwi"},
                        new String[]{"apple", "banana"}
                },
                {
                        new String[]{"circle", "triangle", "square", "hexagon"},
                        new String[]{"hexagon", "triangle", "octagon"},
                        new String[]{"triangle", "hexagon"}
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
