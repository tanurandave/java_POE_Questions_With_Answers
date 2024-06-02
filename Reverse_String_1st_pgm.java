//Implement a Java program to reverse a string.

package POE_Questions;

import java.util.Arrays;
import java.util.Collections; 

public class Reverse_String_1st_pgm {

	public static void main(String[] args) {
			String str="tanuja randave";
			//method 1
			StringBuilder sb=new StringBuilder(str);  
			String rev= sb.reverse().toString();  
		    System.out.println("Reverse:"+rev);
		    
		  //method 2
		   char ch[]=str.toCharArray();  
		    String rev1="";  
		    for(int i=ch.length-1;i>=0;i--){  
		        rev1+=ch[i];  
		    }  
		    System.out.println("reverse:"+rev1);
		  
		    //array reverse order sorting
		    
		    Integer[] arr = { 12, 9, 7, 40, 2, 19, 21, 10 };

	        Arrays.sort(arr, Collections.reverseOrder());

	       System.out.println("Reversed Order Sorted arr[] : " + Arrays.toString(arr));
	}

}
