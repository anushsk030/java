/*
 * File         :  AreaofShape.java
 * Description  : Java program to find area of shapes using method overloading
 * Author       :  Anush S Kumar 
 * Version      :  1.0
 * Date         :13/10/2023   
*/
import java.util.Scanner;
public class AreaofShape {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base of triangle");
		int base=sc.nextInt();
		System.out.println("enter the height of the triangle");
		int height=sc.nextInt();
		System.out.println("enter the length of the rectangle");
		float length=sc.nextInt();
		System.out.println("Enter the breadth of the rectangle");
		float breadth=sc.nextInt();
		System.out.println("enter the radius of circle");
		int radius=sc.nextInt();
		Shape shape=new Shape();
		 shape.area(base,height);
		 shape.area(length,breadth);
		 shape.area(radius);

	}
}
	class Shape {
		public void area(int base,int height) {
			float area=0.5f*base*height;
			System.out.println("Area of Triangle"+area+"square metre");
		}
		public void area(float length,float breadth) {
			float area=length*breadth;
			System.out.println("Area of Rectangle"+area+"square metre");
		}
			
	
		public void area(int radius) {
			float area=3.14f*radius*radius;
			System.out.println("Area of Circle "+area+"square metre");
		}
	}

		
		



