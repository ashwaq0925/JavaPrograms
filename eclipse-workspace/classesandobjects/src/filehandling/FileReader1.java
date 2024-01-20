package filehandling;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class FileReader1 {

	public static void main(String[] args) throws IOException{
		FileReader fileReader = new FileReader("D:\\java\\xyz.text");
		int i;
		while((i=fileReader.read())!=-1) {
			System.out.println((char)i);
		}
		
		fileReader.close();

	}

}
