package com.uservalidation;

public class UserValidation {
 
	public boolean firstNameStartWithCapitalLetterAndMinSizeOf3(String firstName){
		if(firstName.matches("^[A-Z][a-z]{2,}$")) {
			return true;
		}
		return false;
	}

	public boolean lastNameStartWithCapitalLetterAndMinSizeOf3(String lastName) {

		if(lastName.matches("^[A-Z][a-z]{2,}$")) {
			return true;
		}
		return false;
	}

	public boolean emailValidation(String email) {
		if(email.matches("^[a-z]{3,}([.][a-z]{3,})?@[a-z]{2,}\\.[a-z]{2,}([.][a-z]{2,})?$")) {
			return true;
		}
		return false;
	}

	public boolean phoneNumberValidation(String phoneNumber) {
		if(phoneNumber.matches("^[0-9]{2}\\s[6789][0-9]{9}$")) {
			return true;
		}
		return false;
	}

	public boolean passwordHasMinOf8characters(String password) {
		if(password.matches("^.{8,}$")) {
			return true;
		}
		return false;
	}

	public boolean passwordHasMinOf8charactersAndHasMin1CapitalLetter(String password) {
		if(password.matches("^(?=.*[A-Z]).{8,}$")) {
			return true;
		}
		return false;
	}

	public boolean passwordHasMinOf8charactersAndHasMin1NumericLetter(String password) {
		if(password.matches("^(?=.*[0-9]).{8,}$")) {
			return true;
		}
		return false;
	}

	public boolean passwordHasMinOf8charactersAndSpecialCharacter(String password) {
		if(password.matches("^(?=.*[^0-9a-zA-z]).{8,}$")) {
			return true;
		}
		return false;
	}

	public boolean passwordHasMinOf8charactersAndSpecialCharacterAndOneCapitalletterandOneNumericCharacter(
			String password) {
		if(password.matches("^(?=.*[0-9])(?=.*[A-Z])(?=.*[^0-9a-zA-z]).{8,}$")) {
			return true;
		}
		return false;
	}

	public boolean testingNNumberOfEmailsUsingParameterizedTest(String email) {
		if(email.matches("^(?!\\.)(?!.*\\.\\.)([A-Za-z0-9]+[._+-]?[A-Za-z0-9]+)*@([A-Za-z0-9-]+\\.)+[A-Za-z]{2,6}$")) {
			return true;
		}
		return false;
	}
}
