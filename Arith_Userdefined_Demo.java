// 10. Write a Java program to demonstrate custom exception handling.
package POE_Questions;
class User_Arithmentic_Exception extends Exception {
	public User_Arithmentic_Exception(String message) {
		super(message);
	}
}

class DivDemo {
	public static void validateno(int a,int b) throws User_Arithmentic_Exception {
		if (b==0) {
			throw new User_Arithmentic_Exception("number can't divide by zero");
		}
		System.out.println("Division: " + (a/b));
	}
}

public class Arith_Userdefined_Demo {

	public static void main(String[] args) {
		try{
			DivDemo.validateno(12, 2);
			DivDemo.validateno(12, 0);
		}catch(User_Arithmentic_Exception e) {
			System.out.println("Invalid:"+e.getMessage());
			
		}

	}

}
