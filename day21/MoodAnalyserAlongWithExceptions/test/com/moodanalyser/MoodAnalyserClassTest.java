package com.moodanalyser;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MoodAnalyserClassTest {

	@Test
	void test() {
		MoodAnalyserClass moodanalyser=new MoodAnalyserClass();		
		assertEquals("SAD",moodanalyser.analyseMood("i'm very sad today"));
	}
	@Test
   void anaylseMoodTest() {
		MoodAnalyserClass moodanalyser=new MoodAnalyserClass();		
		assertEquals("HAPPY",moodanalyser.analyseMood("i'm in any mood"));  
   }
   	@Test
   void passingMessageInTheConstructor() {
		MoodAnalyserClass moodanalyser=new MoodAnalyserClass("i'm in a sad mood");		
		assertEquals("SAD",moodanalyser.analyseMoodUsingInstanceVariable());  
   }
   	@Test
   void passingMessageInTheConstructorAndGettingHappy() {
		MoodAnalyserClass moodanalyser=new MoodAnalyserClass("i'm in a happy mood");		
		assertEquals("HAPPY",moodanalyser.analyseMoodUsingInstanceVariable());  
   }
   @Test
   void passingNullAsTheMessage(){
	MoodAnalyserClass moodanalyser=new MoodAnalyserClass(null);
	assertEquals("HAPPY",moodanalyser.analyseMoodUsingInstanceVariableAddindExceptions()); 
   }
}