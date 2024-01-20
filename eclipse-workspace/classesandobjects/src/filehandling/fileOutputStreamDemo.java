package filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		FileOutputStream outputstream = new FileOutputStream("D:\\java/abc");
		String str = "welcome to edubridege";
		byte[] bArr = str.getBytes(); //converting string into byte
		outputstream.write(bArr);
		outputstream.close();
		System.out.println("flie is created");
		
		
}

}
