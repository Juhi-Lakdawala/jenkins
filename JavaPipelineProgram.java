import java.util.List;

public class JavaPipelineProgram {

    public static void main(String[] args) {
        List<String> strings = List.of("one", "two", "three", "four", "five");

        // Create a pipeline of operations to be performed on the strings
        strings.stream()
                // Convert each string to uppercase
                .map(StringConverter::toUpperCase)
                // Filter out any strings that start with the letter "e"
                .filter(StringFilter::isNotStartingWithE)
                // Sort the remaining strings in alphabetical order
                .sorted()
                // Perform the final operation using the custom ForEach class
                .forEach(new StringForEach()::perform);
    }

    // Private classes
    private static class StringConverter {
        public static String toUpperCase(String string) {
            return string.toUpperCase();
        }
    }

    private static class StringFilter {
        public static boolean isNotStartingWithE(String string) {
            return !string.startsWith("e");
        }
    }

    private static class StringForEach {
        public void perform(String string) {
            // Custom action to be performed for each string
            System.out.println("Custom ForEach: " + string);
        }
    }
}
