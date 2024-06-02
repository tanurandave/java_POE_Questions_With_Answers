//3. Write a Java program  to demonstrate StringBuilder and StringBuffer Class and its methods..

package POE_Questions;

public class StringBuilder_StringBuffer_Methods {

	public static void main(String[] args) {
		String rd="RadhaKrishna";
		String sr=" SiyaRam";
		System.out.println("oringinal String1 :"+rd);
		System.out.println("oringinal String2 :"+sr);
		StringBuilder sb=new StringBuilder(rd);
		StringBuilder sb1=new StringBuilder(sr);
		//method 1
		sb.append(sr);
		System.out.println("After appending String1 :"+rd);
		System.out.println("After appending String2 :"+sr);
		System.out.println("Buffer sb:"+sb);
		//method 2
		char ch=sb.charAt(2);
		System.out.println("At index 2 return value in buffer:"+ch);
		//method 3
		int cap=sb.capacity();
		System.out.println("capacity of Buffer:"+cap);
		//method 4
		sb.delete(1, 4);
		System.out.println("After deleting 1 to 4 character:"+sb);
		//method 5
		String str=sb.reverse().toString();
		System.out.println("after reverting the content of buffer:"+str);
	
		
		String rd1="RdhaKrishna";
		String sr1=" SiyaRam";
		System.out.println("oringinal String1 :"+rd1);
		System.out.println("oringinal String2 :"+sr1);
		StringBuffer sb11=new StringBuffer(rd1);
		StringBuffer sb22=new StringBuffer(sr1);
		//method 1
		int in=sb11.indexOf("R");
		System.out.println("index of R:"+in);
		
		//method 2
		sb11.append("hii");
		System.out.println("after appending string 1 :"+rd1);
		System.out.println("after appending :"+sb11);
		
		//method 3
		sb11.deleteCharAt(2);
		System.out.println("After removing 2 index Buffer:"+sb11);
		System.out.println("After removing 2 index String:"+rd1);
		
}

}
