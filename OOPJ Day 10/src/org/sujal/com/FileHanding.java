package org.sujal.com;
import java.io.*;

public class FileHanding {

	public static void main(String[] args) throws Exception{
		
		// BufferedWriter is placed on top of FileWriter
        // to provide buffering and convenient methods.
		BufferedWriter bw = new BufferedWriter(new FileWriter("myFile.txt"));
		
		 // Write the first line into the file
		bw.write("PGCP - AC, Student");
		
		//move to nextLine
		bw.newLine();
		
		  // Write the second line
		bw.write("PRN No: 175");
		
		 // Close the writer.
        // This also flushes the buffered data into the file.
		bw.close();
		
		// BufferedReader provides buffering and also gives us
        // the useful readLine() method
		BufferedReader br = 
				new BufferedReader(new FileReader("myFile.txt"));
		
		
		 // This variable will store one line at a time.
		String data;
		
		//this loop continues until the end of file.
		while ((data = br.readLine()) != null) {
		    System.out.println(data);
		}
	
		// Close the reader after finishing reading.
		br.close();
		
	}

}
