package test.java;
import main.java.MoodAnalyzer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoodAnalyzerTest {
    @Test
    void sadMoodTest(){
        MoodAnalyzer sadAnalyser = new MoodAnalyzer("I am in Sad Mood");
        assertEquals("Sad", sadAnalyser.analyseMood());

        // no params test
        MoodAnalyzer sadAnalyserNoParams = new MoodAnalyzer();
        sadAnalyserNoParams.setMessage("I am in Sad Mood");
        assertEquals("Sad", sadAnalyserNoParams.analyseMood());
    }

    @Test
    void happyMoodTest(){
        MoodAnalyzer happyAnalyzer=new MoodAnalyzer("This is a happy message");
        assertEquals("Happy",happyAnalyzer.analyseMood());

         // no params test
        MoodAnalyzer happyAnalyzerNoParams=new MoodAnalyzer();
        happyAnalyzerNoParams.setMessage("aren't you happy");
        assertEquals("Happy",happyAnalyzerNoParams.analyseMood());
    }
}
