package com.uservalidation;

public class UserValidation { 
UserValidationInterface firstNameStartWithCapitalLetterAndMinSizeOf3=firstName->{
	if(firstName.matches("^[A-Z][a-z]{2,}$")) {
			return true;
		}
		throw new UserValidationExceptions("Invalid Last Name");	
};

UserValidationInterface lastNameStartWithCapitalLetterAndMinSizeOf3=lastName->{
	if(lastName.matches("^[A-Z][a-z]{2,}$")) {
			return true;
		}
		throw new UserValidationExceptions("Invalid Last Name");	
};

UserValidationInterface emailValidation=email -> {
		if(email.matches("^[a-z]{3,}([.][a-z]{3,})?@[a-z]{2,}\\.[a-z]{2,}([.][a-z]{2,})?$")) {
			return true;
		}
		throw new UserValidationExceptions("Invalid Email");
};
UserValidationInterface phoneNumberValidation=phoneNumber->{
	if(phoneNumber.matches("^[0-9]{2}\\s[6789][0-9]{9}$")) {
			return true;
		}
	throw new UserValidationExceptions("Invalid Mobile Number");
};

UserValidationInterface passwordValidation=password->{
		if(password.matches("^.{8,}$")) {
			return true;
		}
		throw new UserValidationExceptions("Invalid Password");	
};
 
UserValidationInterface passwordHasMinOf8charactersAndHasMin1CapitalLetter=password->{
	if(password.matches("^(?=.*[A-Z]).{8,}$")) {
			return true;
		}
		throw new UserValidationExceptions("Password must contain minimum 8 characters and 1 capital letter");
};

UserValidationInterface passwordHasMinOf8charactersAndHasMin1NumericLetter=password->{
if(password.matches("^(?=.*[0-9]).{8,}$")) {
			return true;
		}
			throw new UserValidationExceptions("Password must contain minimum 8 characters and 1 numeric character");	
};
UserValidationInterface passwordHasMinOf8charactersAndSpecialCharacter=password->{
if(password.matches("^(?=.*[^0-9a-zA-z]).{8,}$")) {
			return true;
		}
			throw new UserValidationExceptions("Password must contain minimum 8 characters and 1 special character");
};

UserValidationInterface passwordHasMinOf8charactersAndSpecialCharacterAndOneCapitalletterandOneNumericCharacter=password->{
	if(password.matches("^(?=.*[0-9])(?=.*[A-Z])(?=.*[^0-9a-zA-z]).{8,}$")) {
			return true;
		}
		throw new UserValidationExceptions("Password must contain minimum 8 characters, 1 capital letter, 1 numeric character and 1 special character");
};

UserValidationInterface testingNNumberOfEmailsUsingParameterizedTest=email->{
		if(email.matches("^(?!\\.)(?!.*\\.\\.)([A-Za-z0-9]+[._+-]?[A-Za-z0-9]+)*@([A-Za-z0-9-]+\\.)+[A-Za-z]{2,6}$")) {
			return true;
		}
		throw new UserValidationExceptions("Invalid Email");
	};

}
 interface UserValidationInterface {
boolean	getResult(String s) throws UserValidationExceptions;
}