/*
 * File         :  EmployeeDetails.java
 * Description  : Java program to find area of shapes using method overloading
 * Author       :  Anush S Kumar 
 * Version      :  1.0
 * Date         :13/10/2023   
*/
import java.util.Scanner;
public class EmployeeDetails {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Officer officer=new Officer();
		officer.getDetails();
		officer.getSalary();
		officer.getspecialization();
		System.out.println("Officer details");
		officer.printdetails();
		officer.printSpecialization();
		
		Manager manager=new Manager();
		manager.getDetails();
		manager.getSalary();
		manager.getDepartment();
		System.out.println("Manager Details");
		manager.printdetails();
		manager.printDepartment();
		
	}
}
class Employee{
	String specialization;
	Scanner sc=new Scanner(System.in);
	String name,address;
	int age,salary;
	long  phoneNumber;
	public void getDetails() {
		System.out.println("Enter the name");
		name=sc.next();
		System.out.println("enter age");
		age=sc.nextInt();
		System.out.println("enter phone number");
		phoneNumber=sc.nextLong();
		System.out.println("enter the address");sc.nextLine();
		address=sc.nextLine();
		
		
	}
	public void getSalary() {
		System.out.println("enter Salary  ");
		salary=sc.nextInt();
	}
	public void printdetails() {
		System.out.println("Name="+name);
		System.out.println("age="+age);
		
		System.out.println("phone number="+phoneNumber);
		System.out.println("Address="+address);
		System.out.println("salary"+salary);
		
	
		
	}
	
}
 class Officer extends Employee{
	String  specialization;
    public void getspecialization() {
    	System.out.println("Enter the field of specialisation");
    	specialization=sc.next();
    	
    }
public void printSpecialization() {
	System.out.println("Specialization= "+specialization);
	
}
	
	
 }
 class Manager extends Employee{
	 String department;
	 public void getDepartment() {
		 System.out.println("enter the department");
		 department=sc.next();
		 
	 }
	 public void printDepartment() {
		 System.out.println("Department "+department);
	 }
 }
 
	

