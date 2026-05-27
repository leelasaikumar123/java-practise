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
	public String analyseMoodUsingInstanceVariableAddingExceptions()
			throws MoodAnalysisException {
		try {
			if (message.length() == 0) {
				throw new MoodAnalysisException("EMPTY MOOD");
			}
			if (message.contains("sad")) {
				return "SAD";
			}
			else {
				return "HAPPY";
			}

		}
		catch (NullPointerException e) {
			throw new MoodAnalysisException("NULL MOOD");
		}
	}
}

