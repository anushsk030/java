/**************************************************************************************
 * File        : CheckPalindrome.java
 * Description : Java Program to check a word is Palindrome or not
 * Author      :Anush S Kumar
 * Version     :1.0
 * Date        :29/09/2023
 ************************************************************************************/
import java.util.Scanner;
public class CheckPalindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter the String");
		//Input the string
		String input=sc.next();
		boolean isPalindrome=check(input);
		//printing the result
		
		if (isPalindrome){
			System.out.println("The Word is Palindrome");
			
		}
		else {
			System.out.println("The Word is Not Palindrome");
		}
		
	}
	/*Receive a string as input return true if word is Palindrome and return false if word
	 * is not Palindrome*/
	 
	static boolean check(String input) {
		char [] charArray=input.toCharArray();
		int length=input.length();
		//iterate each letter of string till the middle of the string
		for(int i=0;i<=length/2;i++) {
			//checking each character from start and end,if it is not equal return false
			if(charArray[i]!=charArray[length-i-1]) {
				return false;
			}
			
		}
		return true;
	}

}
