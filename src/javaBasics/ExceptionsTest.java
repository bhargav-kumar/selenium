package javaBasics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionsTest {

	public static void main(String[] args) throws FileNotFoundException {

		// Checked exeptions
		File file = new File("C:\\Users\\chbha\\Downloads\\Auomation Testing-20211228 0539-1.mp4");
		FileInputStream fi = new FileInputStream(file);

		// Un checked exceptions
//		1. Arithmatic
//		2. Null pointer
//		3. OutofBounds 
//		4. Number format execptions

		int a = 10;
//		System.out.println(a / 0);
		
		String str = null;
//		System.out.println(str.length());
		
		String str1 = "Hello";
//		System.out.println(Integer.parseInt(str1));
		
		int i[] = new int[6];
		System.out.println(i[7]);
	}

}
