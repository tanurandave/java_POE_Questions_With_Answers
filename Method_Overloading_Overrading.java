//5. Write a Program to demonstrate method overloading & method overriding. 
package POE_Questions;
class Add{
	public void add(int a,int b) {
		System.out.println("Addition of two number:"+(a+b));
	}

	public void add(int a,int b,int c) {
		System.out.println("Addition of three number:"+(a+b+c));
		
	}
	public void hello() {
		System.out.println("this is Add Hello");
	}
}
class Sub extends Add{
	
	public void sub(int a,int b) {
		
		System.out.println("subtraction of two number:"+(a-b));
	}
	public void hello() {
		
		System.out.println("this is Sub Hello");
	}

}
public class Method_Overloading_Overrading {

	public static void main(String[] args) {
		Sub b=new Sub();
		b.add(1, 2);
		b.add(1, 2, 3);
		b.sub(1, 2);
		b.hello();
	}

}
