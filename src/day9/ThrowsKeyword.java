package day9;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsKeyword {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		FileReader fr=null; // Ioexception is suppur class for buffer and filereader
		fr=new FileReader("F:\\test.txt");
		
		BufferedReader bfr= new BufferedReader(fr);
		System.out.println(bfr.readLine());

		Thread.sleep(5000);// intrrrup is seprate class
	}

}
