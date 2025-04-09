import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class KeywordCheckerTest {

    @Test
    public void testContainsJavaKeyword_WithEmptyString() {
        assertFalse(KeywordChecker.containsJavaKeyword(""));
    }

    @Test
    public void testContainsJavaKeyword_WithNoKeyword() {
        assertFalse(KeywordChecker.containsJavaKeyword("Hello world"));
    }

    @Test
    public void testContainsJavaKeyword_WithKeywordAsWord() {
        assertTrue(KeywordChecker.containsJavaKeyword("Don't break my heart"));
    }

    @Test
    public void testContainsJavaKeyword_WithKeywordAsPartOfWord() {
        assertFalse(KeywordChecker.containsJavaKeyword("I love to breakdance"));
    }

    @Test
    public void testContainsJavaKeyword_WithMultipleKeywords() {
        assertTrue(KeywordChecker.containsJavaKeyword("if you continue, return to base"));
    }

    @Test
    public void testContainsJavaKeyword_WithMixedCase() {
        assertTrue(KeywordChecker.containsJavaKeyword("Don't BREAK my heart"));
    }
}