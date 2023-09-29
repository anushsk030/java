/**************************************************************************************
 * File        : FrequencyOfCharacter.java
 * Description : Java Program to find frequency of a character
 * Author      :Anush S Kumar
 * Version     :1.0
 * Date        :29/09/2023
 ************************************************************************************/
import java.util.Scanner;
public class FrequencyOfCharacter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		//input the string 
		String input=sc.nextLine();
		System.out.println("Enter the character of which the frequency to be checked");
		//input the character to check the frequency
		char  checkMe=sc.next().charAt(0);
		int charCount=checkFreq(input,checkMe);
System.out.println("The  occurence of the given character in the string is "+charCount);
	}
	
	static int checkFreq(String input,char checkMe) {
		char [] charArray=input.toCharArray();
		int charCount=0;
		for(int i=0;i<input.length();i++) {
			//check if character present in string,if yes increment the count of character by 1
			if(charArray[i]==checkMe) {
				charCount++;
			}
			
		}
		return charCount;
		
	}
	
		
		

	}


