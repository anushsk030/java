package anushjava;
import java.util.*;
class MultiplicationTable{
	public synchronized void  printTable(int number) {
		for(int i=1;i<10;i++) {
			System.out.println(number+"x"+i+"="+number*i);
		}
	}
}
class FirstThread extends Thread{
	MultiplicationTable t1;
	Scanner sc=new Scanner(System.in);
	int number1;
	public FirstThread(MultiplicationTable t1,int num1) {
		this.t1=t1;
		this.number1=num1;
		
	}
		public void run() {
		
		t1.printTable(number1);
	}
}
class SecondThread extends Thread{
	MultiplicationTable t2;
	Scanner sc;
	int number2;
	public SecondThread(MultiplicationTable t1,int num2) {
		this.t2=t1;
		this.number2=num2;
		
	}

	public void run() {
		
		t2.printTable(number2);
	}
}
public class Experiment14Demo {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of first thread");
		int num1=sc.nextInt();
		System.out.println("Enter the number of second thread");
		int num2=sc.nextInt();
		MultiplicationTable multi=new MultiplicationTable();
		FirstThread t1=new FirstThread(multi,num1);
		SecondThread t2=new SecondThread(multi,num2);
		
		t1.start();
		
		
		t2.start();
		
		
		
		
		
		
		
		
	}

}
