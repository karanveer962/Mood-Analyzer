package test.java;
import main.java.MoodAnalyzer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoodAnalyzerTest {
    @Test
    void testNullMoodReturnsHappy() {
        MoodAnalyzer nullMoodAnalyser = new MoodAnalyzer(null);
        assertEquals("Invalid message", nullMoodAnalyser.analyseMood());
    }

}
