//16. Write a Java program to demonstrate creating directories and files.
package POE_Questions;
import java.io.File;  
import java.util.Scanner;  
public class Directory_File_Creation {

	public static void main(String[] args) {
		 System.out.println("Enter the path where you want to create a folder: ");  
		      Scanner sc = new Scanner(System.in);  
		      String path = sc.next();  
		      
		      System.out.println("Enter the name of the desired a directory: ");  
		      path = path+sc.next();  
		      File f1 = new File(path);      
		      boolean bool2 = f1.mkdirs();  
		      if(bool2){  
		         System.out.println("Folder is created successfully");  
		      }else{  
		         System.out.println("Error Found!");  
		      }  
		   }  
		}  