//4..Write a Java program to check if a string is a palindrome.

package POE_Questions;

public class String_Palindrom_Or_Not {
	  
	    
	    public static void main(String[] args) {    
	        String string1 = "RadhaKrishna";  
	        boolean flag = true;    
	             
	        string1 = string1.toLowerCase();    
	            
	          for(int i = 0; i < string1.length()/2; i++){    
	            if(string1.charAt(i) != string1.charAt(string1.length()-i-1)){    
	                flag = false;    
	                break;    
	            }    
	          }
	        if(flag)    
	            System.out.println("Given string is palindrome");    
	        else    
	            System.out.println("Given string is not a palindrome");    
	    }    
}  