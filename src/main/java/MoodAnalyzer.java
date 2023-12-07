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
        if (message.toLowerCase().contains("happy")) {
            return "Happy";
        } else if (message.toLowerCase().contains("sad")) {
            return "Sad";
        } else {
            return "Can't tell";
        }
    }

    public static void main(String[] args) {

        MoodAnalyzer defaultAnalyser = new MoodAnalyzer();
        System.out.println("Default Mood: " + defaultAnalyser.analyseMood());

        MoodAnalyzer customAnalyser = new MoodAnalyzer("I am so happy!");
        System.out.println("Custom Mood: " + customAnalyser.analyseMood());
    }

}
