//10. Write a Java program to demonstrate custom exception handling.
package POE_Questions;

class InvalidAgeException extends Exception {
	public InvalidAgeException(String message) {
		super(message);
	}
}

class AgeValidator {
	public static void validateAge(int age) throws InvalidAgeException {
		if (age < 0 || age > 18) {
			throw new InvalidAgeException("Age must be between 0 and 18");
		}
		System.out.println("Age is valid: " + age);
	}
}

public class Userdefined_Exception {
	public static void main(String[] args) {
		try {
			AgeValidator.validateAge(25);
			AgeValidator.validateAge(-5);
		} catch (InvalidAgeException e) {
			System.out.println("Invalid Age: " + e.getMessage());
		}
	}
}
