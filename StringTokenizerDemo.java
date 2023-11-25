import java.util.StringTokenizer;
import java.util.Scanner;
public class StringTokenizerDemo {
	

	public static void main(String[] args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		System.out.println("tokenized string  :");
		StringTokenizer obj=new StringTokenizer(str);
		while(obj.hasMoreTokens()) {
			
			int num=Integer.parseInt(obj.nextToken());
			
			System.out.println(num+"  ");
			
			sum=sum+num;
			
		}
		System.out.println("Sum is "+sum);
		
	}

}
