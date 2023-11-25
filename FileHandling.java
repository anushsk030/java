import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileReader;
public class FileHandling {
	public static void main(String [] args) {
		String data="Input for file handling";
		FileWriter input=null;
		FileReader output=null;
		FileWriter newfile=null;
		char [] data2=new char[23];
		try {
			input= new FileWriter("input.txt");
			input.write(data);
			input.flush();
			input.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		try {
			output=new FileReader("input.txt");
			int bytes=output.read(data2);
			System.out.println("input.txt");
			System.out.println(data2);
			output.close();
			newfile=new FileWriter("output.txt");
			newfile.write(data2,0,bytes);
			System.out.println("output.txt");
			System.out.println(data2);
			newfile.flush();
			newfile.close();
			
			
			
			
		}catch(IOException e) {
			System.out.println("NO ACCESS TO WRITE");
			e.printStackTrace();
		}
		
		
		
	}

}
