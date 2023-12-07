package main.java;

public class MoodAnalyzer {
    private String message;

    public MoodAnalyzer() {   // Default Constructor
        this.message = "";
    }

    public enum MoodAnalysisError {
        NULL_MOOD, INVALID_MOOD,EMPTY_MOOD
    }

    // Parameterized Constructor
    public MoodAnalyzer(String message) {
        this.message = message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public String analyseMood()throws MoodAnalysisException{
        try {
            if (message == null){
                throw new MoodAnalysisException(MoodAnalysisError.NULL_MOOD);
            } else if(message.trim().isEmpty()) {
                throw new MoodAnalysisException(MoodAnalysisError.EMPTY_MOOD);
            }

            if (message.toLowerCase().contains("happy")) {
                return "Happy";
            } else if (message.toLowerCase().contains("sad")) {
                return "Sad";
            } else {
               throw new MoodAnalysisException(MoodAnalysisError.INVALID_MOOD);
            }
        }
        catch(MoodAnalysisException e){
            throw e;
        }
    }

    public static void main(String[] args) {

        try {
            MoodAnalyzer moodAnalyser = new MoodAnalyzer();
            System.out.println("Mood: " + moodAnalyser.analyseMood());
        } catch (MoodAnalysisException e) {
            System.out.println("Error: " + e.getError());
        }
    }

}
