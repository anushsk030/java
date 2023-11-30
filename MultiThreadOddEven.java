import java.util.Random;//To create random numbers.
class NumberManager{
	private int generatedNumber;
	private boolean numberGenerated=false;//to check if number is generated.
	public synchronized void generateNumber() {
		generatedNumber=new Random().nextInt(99)+2;//generate number from 2 onwards
		System.out.println("GeneratedRandom Number:"+generatedNumber);
		numberGenerated=true;
		notifyAll();//
	}
	public synchronized void printEvenNumbers() throws InterruptedException {
		while(!numberGenerated||generatedNumber%2!=0) {
			wait();
		}
		for(int i=2;i<generatedNumber;i+=2) {
			System.out.print(i+" ");
		}
		
		numberGenerated=false;
		System.out.println(" ");
		
	}
	
	public synchronized void printOddNumbers() throws InterruptedException{
		
			while(!numberGenerated||generatedNumber%2==0) {
				wait();
			}
			for(int i=1;i<generatedNumber;i+=2) {
				System.out.print(i+" ");
			}
			numberGenerated=false;
			
			
	}
	
    
	
}
class NumberGenerator extends Thread{
	NumberManager numberManager;
	public NumberGenerator(NumberManager numberManager) {
		this.numberManager=numberManager;
		
		
	}
	public void run() {
		while(true) {
		numberManager.generateNumber();
		try {    //it provides exception.
			Thread.sleep(1000);//to wait for 1 second.
		} catch (InterruptedException e) {  
						e.printStackTrace();
		}
	}
	}
	
	
}
class EvenPrinterThread extends Thread{
	NumberManager numberManager;
	public EvenPrinterThread(NumberManager numberManager) {
		this.numberManager=numberManager;
		
		
	}
	public void run() {
		while(true) {  //for infinite loop
			try {
				numberManager.printEvenNumbers();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}
class OddPrinterThread extends Thread{
	NumberManager numberManager;
	public OddPrinterThread(NumberManager numberManager) {
		this.numberManager=numberManager;
		
		
	}
	public void run() {
		while(true) {  //for infinite loop
			try {
				numberManager.printOddNumbers();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}

public class MultiThreadOddEven {

	public static void main(String[] args) {
		NumberManager numberManager=new NumberManager();
		NumberGenerator numberGenerator=new NumberGenerator(numberManager);
		EvenPrinterThread evenPrinterThread=new EvenPrinterThread(numberManager);
		OddPrinterThread oddPrinterThread=new OddPrinterThread(numberManager);
		numberGenerator.start();
		evenPrinterThread.start();
		
		
		oddPrinterThread.start();

	}

}
