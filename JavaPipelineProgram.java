import java.util.List;

public class JavaPipelineProgram {

    public static void main(String[] args) {
        List<String> strings = List.of("one", "two", "three", "four", "five");

        // Create a pipeline of operations to be performed on the strings
        strings.stream()
                // Convert each string to uppercase
                .map(String::toUpperCase)
                // Filter out any strings that start with the letter "e"
                .filter(string -> !string.startsWith("E"))
                // Sort the remaining strings in alphabetical order
                .sorted()
                // Print each string to the console
                .forEach(System.out::println);
    }
}
