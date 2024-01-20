package filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import controlflow.ForLoopsEx;

public class FileInputStream12 {

    public static void main(String[] args) throws IOException {
        FileInputStream inputstream1 = new FileInputStream("D:\\java\\abc.text");
        int i = 0;

        while ((i = inputstream1.read()) != -1) {
            System.out.print((char) i);
        }

        inputstream1.close();
    }

}
