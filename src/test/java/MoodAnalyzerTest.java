package test.java;
import main.java.MoodAnalysisException;
import main.java.MoodAnalyzer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MoodAnalyzerTest {
   @Test
    void testEmptyMoodThrowsMoodAnalysisException() {
        MoodAnalyzer emptyMoodAnalyser = new MoodAnalyzer("");
       MoodAnalysisException exception =assertThrows(MoodAnalysisException.class,emptyMoodAnalyser::analyseMood);
       assertEquals(MoodAnalyzer.MoodAnalysisError.EMPTY_MOOD, exception.getError());
   }
    @Test
    void testNullMoodThrowsMoodAnalysisException() {
        MoodAnalyzer emptyMoodAnalyser = new MoodAnalyzer(null);
        MoodAnalysisException exception =assertThrows(MoodAnalysisException.class,()-> emptyMoodAnalyser.analyseMood());
        assertEquals(MoodAnalyzer.MoodAnalysisError.NULL_MOOD, exception.getError());
    }

}
