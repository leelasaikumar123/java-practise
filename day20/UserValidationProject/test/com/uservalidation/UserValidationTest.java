package com.uservalidation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
class UserValidationTest {

	@Test
	void firstNameStartWithCapitalLetterAndMinSizeOf3() {
	UserValidation validation=new UserValidation();
	boolean result;
	try {
		result = validation.firstNameStartWithCapitalLetterAndMinSizeOf3("Leela");
		assertEquals(true, result);
	} catch (UserValidationExceptions e) {
	fail("Invalid First Name");
	}
	
	}
	
	@Test
	void lastNameStartWithCapitalLetterAndMinSizeOf3() {
	UserValidation validation=new UserValidation();
	boolean result;
	try {
		result = validation.lastNameStartWithCapitalLetterAndMinSizeOf3("Meda");
		assertEquals(true, result);
	} catch (UserValidationExceptions e) {
   fail("Invalid Last Name");
	}
	
	}
	
	@Test
	void emailValidation() {
	UserValidation validation=new UserValidation();
	boolean result;
	try {
		result = validation.emailValidation("abc.xyz@bl.co.in");
		assertEquals(true, result);
	} catch (UserValidationExceptions e) {
	fail("Invalid Email");
	}
	}
	
	@Test
	void phoneNumberValidation() {
	UserValidation validation=new UserValidation();
	boolean result;
	try {
		result = validation.phoneNumberValidation("91 9381822209");
		assertEquals(true, result);
	} catch (UserValidationExceptions e) {
fail("Invalid Mobile Number");
	}
	
	}
	
	@Test
	void passwordHasMinOf8characters() {
	UserValidation validation=new UserValidation();
	boolean result;
	try {
		result = validation.passwordHasMinOf8characters("Tanuja Naidu");
		assertEquals(true, result);
	} catch (UserValidationExceptions e) {
fail("Invalid Password");
	}
	
	}
	@Test
	void passwordHasMinOf8charactersAndHasMin1CapitalLetter() {
	UserValidation validation=new UserValidation();
	boolean result;
	try {
		result = validation.passwordHasMinOf8charactersAndHasMin1CapitalLetter("Tanuja Naidu");
		assertEquals(true, result);
	} catch (UserValidationExceptions e) {
   fail("Password must contain minimum 8 characters and 1 capital letter");
	}
	}
	
	@Test
	void passwordHasMinOf8charactersAndHasMin1NumericLetter() {
	UserValidation validation=new UserValidation();
	boolean result;
	try {
		result = validation.passwordHasMinOf8charactersAndHasMin1NumericLetter("Tanuja Naidu1");
		assertEquals(true, result);
	} catch (UserValidationExceptions e) {
	fail("Password must contain minimum 8 characters and 1 numeric character");
	}
	}
	
	@Test
	void passwordHasMinOf8charactersAndHasMin1SpecialCharacter() {
	UserValidation validation=new UserValidation();
	boolean result;
	try {
		result = validation.passwordHasMinOf8charactersAndSpecialCharacter("Tanuja@Naidu1");
		assertEquals(true, result);
	} catch (UserValidationExceptions e) {
	  fail("Password must contain minimum 8 characters and 1 special character");
	}
	}
	@Test
	void passwordHasMinOf8charactersAndHasMin1SpecialCharacterAndOneCapitalletterandOneNumericCharacter() {
	UserValidation validation=new UserValidation();
	boolean result;
	try {
		result = validation.passwordHasMinOf8charactersAndSpecialCharacterAndOneCapitalletterandOneNumericCharacter("Tanuja@Naidu1");
		assertEquals(true, result);
	} catch (UserValidationExceptions e) {
    fail("Invalid Password");
	}
	
	}
	@ParameterizedTest
	@CsvSource({
		"abc@yahoo.com,true",
		"abc-100@yahoo.com,true",
         "abc.100@yahoo.com,true",
         ".abc123@.com,false"
		
	})
	void testingNNumberOfEmailsUsingParameterizedTest(String email,boolean expected) {
		UserValidation validation=new UserValidation();
		boolean actual;
		try {
			actual = validation.testingNNumberOfEmailsUsingParameterizedTest(email);
			assertEquals(expected,actual);
		} catch (UserValidationExceptions e) {
 assertEquals(false, expected);
		}
	}
	
}
