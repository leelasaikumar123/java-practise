package com.uservalidation;

public class UserValidation { 
	public boolean firstNameStartWithCapitalLetterAndMinSizeOf3(String firstName) throws UserValidationExceptions{
		if(firstName.matches("^[A-Z][a-z]{2,}$")) {
			return true;
		}
				throw new UserValidationExceptions("Invalid First Name");
	}

	public boolean lastNameStartWithCapitalLetterAndMinSizeOf3(String lastName) throws UserValidationExceptions{

		if(lastName.matches("^[A-Z][a-z]{2,}$")) {
			return true;
		}
		throw new UserValidationExceptions("Invalid Last Name");
	}

	public boolean emailValidation(String email) throws UserValidationExceptions{
		if(email.matches("^[a-z]{3,}([.][a-z]{3,})?@[a-z]{2,}\\.[a-z]{2,}([.][a-z]{2,})?$")) {
			return true;
		}
		throw new UserValidationExceptions("Invalid Email");
	}

	public boolean phoneNumberValidation(String phoneNumber) throws UserValidationExceptions{
		if(phoneNumber.matches("^[0-9]{2}\\s[6789][0-9]{9}$")) {
			return true;
		}
	throw new UserValidationExceptions("Invalid Mobile Number");
	}

	public boolean passwordHasMinOf8characters(String password) throws UserValidationExceptions{
		if(password.matches("^.{8,}$")) {
			return true;
		}
		throw new UserValidationExceptions("Invalid Password");
	}

	public boolean passwordHasMinOf8charactersAndHasMin1CapitalLetter(String password) throws UserValidationExceptions{
		if(password.matches("^(?=.*[A-Z]).{8,}$")) {
			return true;
		}
		throw new UserValidationExceptions("Password must contain minimum 8 characters and 1 capital letter");
	}

	public boolean passwordHasMinOf8charactersAndHasMin1NumericLetter(String password) throws UserValidationExceptions{
		if(password.matches("^(?=.*[0-9]).{8,}$")) {
			return true;
		}
			throw new UserValidationExceptions("Password must contain minimum 8 characters and 1 numeric character");
	}

	public boolean passwordHasMinOf8charactersAndSpecialCharacter(String password) throws UserValidationExceptions{
		if(password.matches("^(?=.*[^0-9a-zA-z]).{8,}$")) {
			return true;
		}
			throw new UserValidationExceptions("Password must contain minimum 8 characters and 1 special character");
	}

	public boolean passwordHasMinOf8charactersAndSpecialCharacterAndOneCapitalletterandOneNumericCharacter (
			String password) throws UserValidationExceptions{
		if(password.matches("^(?=.*[0-9])(?=.*[A-Z])(?=.*[^0-9a-zA-z]).{8,}$")) {
			return true;
		}
		throw new UserValidationExceptions("Password must contain minimum 8 characters, 1 capital letter, 1 numeric character and 1 special character");
	}

	public boolean testingNNumberOfEmailsUsingParameterizedTest(String email) throws UserValidationExceptions{
		if(email.matches("^(?!\\.)(?!.*\\.\\.)([A-Za-z0-9]+[._+-]?[A-Za-z0-9]+)*@([A-Za-z0-9-]+\\.)+[A-Za-z]{2,6}$")) {
			return true;
		}
		throw new UserValidationExceptions("Invalid Email");
	}
}
