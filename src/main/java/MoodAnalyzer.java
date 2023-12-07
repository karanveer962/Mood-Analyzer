package main.java;

public class MoodAnalyzer {
    private String message;

    public MoodAnalyzer() {   // Default Constructor
        this.message = "";
    }
    // Parameterized Constructor
    public MoodAnalyzer(String message) {
        this.message = message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public String analyseMood() {
        try {
            if (message == null || message.trim().isEmpty()) {
                throw new InvalidMoodException("Invalid mood: Mood message cannot be null or empty");
            }

            if (message.toLowerCase().contains("happy")) {
                return "Happy";
            } else if (message.toLowerCase().contains("sad")) {
                return "Sad";
            } else {
                return "Can't tell";
            }
        }
        catch(InvalidMoodException e){
            return "Invalid message";
        }
    }

    public static void main(String[] args) {

        MoodAnalyzer Analyser = new MoodAnalyzer();
        System.out.println("Mood: " + Analyser.analyseMood());
    }

}
