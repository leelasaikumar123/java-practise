package com.moodanalyser;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MoodAnalyserClassTest {

	@Test
	void test() {
		MoodAnalyserClass moodanalyser=new MoodAnalyserClass();		
		assertEquals("SAD",moodanalyser.analyseMood("i'm very sad today"));
	}

}