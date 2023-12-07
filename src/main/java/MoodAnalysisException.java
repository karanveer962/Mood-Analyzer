package main.java;
public class MoodAnalysisException extends Exception{
    private MoodAnalyzer.MoodAnalysisError error;

    public MoodAnalysisException(MoodAnalyzer.MoodAnalysisError  error){
        super(error.toString());
        this.error=error;
    }
    public MoodAnalyzer.MoodAnalysisError getError(){
        return error;
    }
}
