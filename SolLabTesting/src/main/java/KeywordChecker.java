import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class KeywordChecker {

    private static final Set<String> JAVA_KEYWORDS = new HashSet<>(Arrays.asList(
            "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char",
            "class", "const", "continue", "default", "do", "double", "else", "enum",
            "extends", "final", "finally", "float", "for", "goto", "if", "implements",
            "import", "instanceof", "int", "interface", "long", "native", "new", "package",
            "private", "protected", "public", "return", "short", "static", "strictfp",
            "super", "switch", "synchronized", "this", "throw", "throws", "transient",
            "try", "void", "volatile", "while", "_", "var", "record", "yield", "permits",
            "sealed", "non-sealed"
    ));

    /**
     * Checks if the input string contains any Java keyword.
     *
     * @param input the string to check
     * @return true if the string contains a Java keyword, false otherwise
     */
    public static boolean containsJavaKeyword(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }

        // Split the input string into words and check each word
        String[] words = input.split("\\s+");
        for (String word : words) {
            // Remove any punctuation and convert to lowercase
            String cleanWord = word.replaceAll("[^a-zA-Z0-9_-]", "").toLowerCase();
            if (JAVA_KEYWORDS.contains(cleanWord)) {
                return true;
            }
        }

        return false;
    }
}
