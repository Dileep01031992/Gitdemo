package SONU.SONU;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Readtext {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
			BufferedReader objreader = null;
			
			String strCurrentLine;
			
			try {
				objreader = new BufferedReader(new FileReader("H:\\Selenium 2019\\Question Bank.txt"));
				
				while((strCurrentLine =objreader.readLine())!=null){
					System.out.println(strCurrentLine);
				}
				
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			finally {

				   try {
				    if (objreader != null)
				     objreader.close();
				   } catch (IOException ex) {
				    ex.printStackTrace();
				   }
				  }
		
		
		
		
		

	}

}
