package com.example;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

class MathOperationsTest {
	@Test
	void addTest() {
		MathOperations op=new MathOperations();
		assertEquals(5,op.add(2,3));
	}

		@Test
	void subTest() {
		MathOperations op=new MathOperations();
		assertEquals(-1,op.sub(2,3));
	}

		@Test
	void mulTest() {
		MathOperations op=new MathOperations();
		assertEquals(6,op.mul(2,3));
	}

		@Test
	void divTest() {
		MathOperations op=new MathOperations();
		assertEquals(0,op.div(2,3));
	}
		@Test
	void printingUsingClass(){
	 List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9);
	  MathOperations.printListUsingClass(list);	
	}
 		@Test
	void printingUsingIterator(){
	 List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9);
	  MathOperations.printListUsingIterator(list);	
	}
	 	@Test
	void printingUsingAnonomousClass(){
	 List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9);
	  MathOperations.printListUsingAnonomousClass(list);	
	}
		 	@Test
	void printingUsingLambdaExpressions(){
	 List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9);
	  MathOperations.printListUsingLambdaFunction(list);	
	}
	@Test
	void convertionOfIntergersToDoubles(){
	 List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9);
	  MathOperations.convertionOfIntergersToDoubles(list);	
	}
}
