abstract class Shape

 {

 abstract void numberOfSides();
 }
class Rectangle extends Shape
 {
 void numberOfSides()
 {
System.out.println("Number of Sides of Rectangle is: 4");
 }
}
class Triangle extends Shape
 {
 void numberOfSides()
 {
System.out.println("Number of Sides of Triangle Shape is: 3");
}
}
class Hexagon extends Shape
{
 void numberOfSides()
 {
System.out.println("Number of Sides of Hexagon Shape is: 6");
}
}
public class 

 {
public static void main(String args[])
 {
Rectangle R = new Rectangle();
R.numberOfSides();

Triangle T = new Triangle();
T.numberOfSides();
Hexagon H = new Hexagon();
H.numberOfSides();
}

