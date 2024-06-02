//7. Write a Java program to demonstrate the concept of dynamic method dispatch.
package POE_Questions;

class A {
	public void Hello() {
		System.out.println("This is Hello A");
	}
}

class B extends A {
	public void Hello() {
		super.Hello();
		System.out.println("This is Hello B");
	}
}

class C extends A {
	public void Hello() {
		System.out.println("This is Hello C");
	}
}

public class DMD_Concept {

	public static void main(String[] args) {
		A a1 = new B();
		A al2 = new C();

		a1.Hello();
		al2.Hello();
	}

}