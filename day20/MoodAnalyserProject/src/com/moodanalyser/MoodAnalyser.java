package com.moodanalyser;

public class MoodAnalyser {
public String analyseMood(String s) {
	if(s.contains("sad")) {
		return "SAD";
	}
	else {
		return "HAPPY";
	}
}
}
