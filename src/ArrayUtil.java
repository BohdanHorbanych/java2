import java.util.LinkedHashSet;
import java.util.Set;

public class ArrayUtil {

    public static String[] findCommon(String[] array1, String[] array2) {
        Set<String> set1 = new LinkedHashSet<>();
        Set<String> commonElements = new LinkedHashSet<>();

        // Add elements from the first array to set1
        for (String element : array1) {
            set1.add(element);
        }

        // Check if elements in the second array exist in set1
        for (String element : array2) {
            if (set1.contains(element)) {
                commonElements.add(element);
            }
        }

        // Convert the common elements set to an array
        return commonElements.toArray(new String[0]);
    }
}
