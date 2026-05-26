package com.moodanalyser;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MoodAnalyserTest {

	@Test
	void test() {
		MoodAnalyser moodanalyser=new MoodAnalyser();
		assertEquals("SAD",moodanalyser.analyseMood("This is a sad message"));
	}

}
