package filehandling;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter1 {

	public static void main(String[] args)throws IOException {
		FileWriter filwriter = new FileWriter("D:\\java\\xyz.text",true);
		filwriter.write("how are you");
		filwriter.close();
		System.out.println("file is created");
	}

}
