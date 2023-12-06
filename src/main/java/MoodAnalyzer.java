package main.java;

public class MoodAnalyzer {
    public String analyseMood(String message) {
        if (message.toLowerCase().contains("happy")) {
            return "Happy";
        } else {
            return "Sad";
        }
    }

    public static void main(String[] args) {

        MoodAnalyzer moodAnalyser = new MoodAnalyzer();

        String happyMessage = "I am so happy for you!";
        String happyMood = moodAnalyser.analyseMood(happyMessage);
        System.out.println("Mood: " + happyMood);


        String sadMessage = "take me out of this misery god";
        String sadMood = moodAnalyser.analyseMood(sadMessage);
        System.out.println("Mood: " + sadMood);
    }

}
