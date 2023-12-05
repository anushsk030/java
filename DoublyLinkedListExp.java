import java.util.LinkedList;
import java.util.Scanner;
class DoublyLinkedList<T>{
	private LinkedList<T>list=new LinkedList<>();
	public void add(T element) {
		list.addLast(element);
	}
	public void insertAtAnyPosition(int index,T element) {
		list.add(index, element);
	}
	public void  insertAtFront(T element) {
		list.addFirst(element);
	}
	public void remove(int index) {
		list.remove(index);
	}
	public void display() {
		for(T element : list){
			System.out.println(element+" ");
			
		}
		System.out.println(" ");
	}
}


public class DoublyLinkedListExp{
	public static void main(String [] args) {
		int choice;
		DoublyLinkedList<Integer>doublyLinkedList=new DoublyLinkedList();
		
		do {
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the choice ");
			System.out.println("1. Insertion at Beginning 2. Insertion at end 3.Insertion at any position ");
			System.out.println("4. Delete at any position 5. Display   6.Exit");
			choice=sc.nextInt();
			switch(choice) {
			case 1:{
				System.out.println("enter the element to add at beginning");
				int element=sc.nextInt();
				doublyLinkedList.insertAtFront(element);
				
				break;
				
			}
			case 2:{
				System.out.println("enter the element");
				int element=sc.nextInt();
				doublyLinkedList.add(element);
				
				break;
			
			}
			case 3:{
				System.out.println("enter the index");
				int index=sc.nextInt();
				System.out.println("enter the element");
				int element=sc.nextInt();
				doublyLinkedList.insertAtAnyPosition(index,element);
				
				break;
			}
			case 4:{
				
                    System.out.println("Enter the position to delete");
                    int index = sc.nextInt();
                    doublyLinkedList.remove(index);
                
                
				
				break;
			}
			case 5:{
				System.out.println("The Linked List is");
				doublyLinkedList.display();
				break;
			}
			case 6:{
				
				break;
			}
				
				
			}
			//here
		}while(choice<6);
	}
	
}