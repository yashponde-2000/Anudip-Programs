package lab41;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class FileException {
	public static void main(String[] args) {
		//try catch block 
		//try block to read the file
		try
		{
			readFile("text1.txt");
		}
		//cath throws error if file not found 
		catch(FileNotFoundException ex) 
		{
			System.out.println("Error: "+ex.getMessage());
		}
	}

	//readFile method throws FileNotFoundException
	private static void readFile(String FileName) throws FileNotFoundException{
		
		File f=new File(FileName);		
		Scanner sc=new Scanner(f);
		
		while(sc.hasNextLine())
		{
			String l = sc.nextLine();
			System.out.println(l);
		}
	}

}
