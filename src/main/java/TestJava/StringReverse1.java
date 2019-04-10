package TestJava;

public class StringReverse1 {
public static void main(String[] args) {
	//https://www.softwaretestinghelp.com/java-coding-interview-programs/
//	Q #1) Write a Java Program to reverse a string without using String inbuilt function.
//	Answer: Here, we are initializing a string variable str and are making use of the string builder class.
//	The object of the string builder class str2 will be further used to append the value stored in the string variable str.
//	Thereafter, we are using the inbuilt function of string builder (reverse()) and storing the new reversed string in str2.
//	Finally, we are printing str2.
	
	String str= "Automation";
	StringBuilder str2= new StringBuilder();
	str2.append(str);
	str2=str2.reverse();
	System.out.println(str2);
}
}
