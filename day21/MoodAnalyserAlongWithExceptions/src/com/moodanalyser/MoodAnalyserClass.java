package com.moodanalyser;

public class MoodAnalyserClass {
	String message;

	public MoodAnalyserClass() {
	}    
	public MoodAnalyserClass(String message) {
        this.message = message;
    }

    public String analyseMoodUsingInstanceVariable() {
	if(message.contains("sad")) {
		return "SAD";
	}
	else {
		return "HAPPY";
	}
	}
	
	public String analyseMood(String s) {
	if(s.contains("sad")) {
		return "SAD";
	}
	else {
		return "HAPPY";
	}
	}

	public String analyseMoodUsingInstanceVariableAddindExceptions() throws MoodAnalysisException {
try {
		if(message.contains("sad")) {
		return "SAD";
	}
	else {
		return "HAPPY";
	}
} catch (Exception e) {
	throw new MoodAnalysisException("User Must pass a value");
}
	}	
}

