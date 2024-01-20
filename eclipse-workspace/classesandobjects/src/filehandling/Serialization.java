package filehandling;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
public class Serialization {
	public static void main(String[]args)throws FileNotFoundException,IOException {
		Student student =new Student(101,"riya");
		
		
		ObjectOutputStream objectOutputStream =new ObjectOutputStream(new FileOutputStream("D:\\java\\xyz.text"));
		objectOutputStream.writeObject(student);
		objectOutputStream.flush();
		System.out.println("converted to byte stream");
		
	}
	
}
