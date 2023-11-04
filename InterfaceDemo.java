
public class InterfaceDemo {
	public static void main(String[] args) {
		Spider spider=new Spider();
		Cat cat=new Cat();
		Fish fish=new Fish();
		System.out.println("FISH");
		fish.setName("Mimi");
		System.out.println("this fish's name is  "+fish.getName());
		fish.eat();
		fish.walk();
		fish.setName("Momo");
		System.out.println("This fish's name is "+fish.getName());
		System.out.println("Cat");
		cat.setName("Fluffy");
		System.out.println("this Cat's name is  "+cat.getName());
		cat.walk();
		cat.eat();
		cat.setName("Moose");
		System.out.println("this Cat's name is  "+cat.getName());
		System.out.println("Spider");
		spider.walk();
		spider.eat();
		
		
		

       }

  }
//****************************************************************************************************************************************************
abstract class Animal{
	protected int legs;
	protected Animal(int leg) {
		this.legs=leg;
	}
	public abstract void eat();
	public void walk() {
		System.out.println("this animal walks on "+legs+" legs ");
			}
}
class Spider extends Animal{
	public Spider(){
		super(8);//spiders have 8 legs.
	}
	@Override
	public void eat() {
		System.out.println("Spider eats Insects");
		
	}
	
	
}
//********************************************************************************************************************************************************************
interface Pet{
	public String getName();
	public void setName(String name);
	public void play();//no implementation in interface for any class
}
class Cat extends Animal implements Pet{
	private String catName;
	public Cat(String name) { 
		super(4);// call the super constructor to define cats have 4 legs
		this.catName=name;
		
	}
	Cat(){
		this(" ");
	}
	
	
	@Override
	public void eat() {
		System.out.println("Cat eats fishes");
		
	}
	@Override
	public void setName(String name) {
		this.catName=name;
		
	}
	@Override
	public String getName() {
		return catName;
		
	}
	@Override
	public void play() {
		System.out.println("Cat playing");
		
	}
	}
//**************************************************************************************************************************************************************************
class Fish extends Animal implements Pet{
	private String fishName;
	public Fish() {
		super(0);//Fish don't have legs
	}
	@Override
	public void eat() {
		System.out.println("Fish eats plants ");
		
	}
	@Override
	public void setName(String name) {
		this.fishName=name;
	}
	@Override
	public String getName() {
		return fishName;
	}
	@Override
	public void play() {
		System.out.println("Fish playing");
		
	}
	@Override
	public void walk() {
		System.out.println("Fish can't walk");//Fish can't walk so override the walk method
	}
	
	
	
	
	
}
