/*
 * File         :  Experiment14 * 
 * Author       :  Anush S Kumar 
 * Version      :  1.0
 * Date         :01/12/2023   
*/
import java.util.*;
class MultiplicationTable{
	public synchronized void  printTable(int number) {
		for(int i=1;i<=10;i++) {
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
		//System.out.println("Priority of thread 1 :"+Thread.currentThread().getPriority());
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
		//System.out.println("Priority ofthread 2  :"+Thread.currentThread().getPriority());
		t2.printTable(number2);
	}
}
class ThirdThread extends Thread{
	MultiplicationTable t3;
	int number3;
	public ThirdThread(MultiplicationTable t3,int num3) {
		this.t3=t3;
		this.number3=num3;
	}
	public void run() {
		//System.out.println("Priority of thread 3  :"+Thread.currentThread().getPriority());
		t3.printTable(number3);
	}
}
public class SynchronizationDemo {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Table you want to run by Thread1");
		int num1=sc.nextInt();
		System.out.println("Enter the Table you want to run by Thread2");
		int num2=sc.nextInt();
		System.out.println("Enter the Table you want to run by Thread3");
		int num3=sc.nextInt();
		MultiplicationTable multi=new MultiplicationTable();
		FirstThread t1=new FirstThread(multi,num1);
		t1.setPriority(3);
		SecondThread t2=new SecondThread(multi,num2);
		t2.setPriority(4);
		ThirdThread t3=new ThirdThread(multi, num3);
		t3.setPriority(5);
		t1.start();
		t2.start();
		t3.start();
		
		
		
		
		
		
		
	}

}
