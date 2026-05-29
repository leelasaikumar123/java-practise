package com.example;
import static org.junit.jupiter.api.Assertions.*;
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

}
