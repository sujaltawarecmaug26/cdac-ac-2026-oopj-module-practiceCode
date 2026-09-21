package org.sujal.com;
import java.io.*;
import java.util.Scanner;

//below is basic concept/methods of file handling using byte and char stream
 
public class Program {

	public static void main(String[] args) throws IOException {
		
		
		
		//example of byte stream
	
			//FileInputStream class check whether given file contains or not.
			//FileInputStream use to read file 
			FileInputStream fis = new FileInputStream("myFile.txt");
			//FileOutputStream use to write file
			//why true? -> it means Append new data instead of replacing existing data.
			FileOutputStream fos = new FileOutputStream("myFile.txt", true);		
			//it use to read text file only
			FileReader fr = new FileReader("myFile.txt");

			//write data into the file (Ascii values)
//			fos.write(65);
//			fos.write(66);
			int data;
			

//			why-1? because -> returns	-1 when there is no more data to read.
				while((data = fr.read()) != -1) {
					
					//casting integer char, because byte stream contain binary data(1,0,1,0)
					System.out.print((char)data);
				}
				
				//read file data using Scanner Class
//				Scanner read = new Scanner(fis);
//				
//				while(read.hasNext()) {
//					String fdata = read.nextLine();
//					System.out.println(fdata);
//				}
			
		
		
		//example of char stream
//		try {
//			
//			// pass the filename or directory name to File
//			File file = new File("myFile.txt");
//			
//			// apply File class methods on File object
////			System.out.println("File Name: " + file.getName());
////	        System.out.println("Path: " + file.getPath());
////	        System.out.println("Absolute path:"
////	                           + file.getAbsolutePath());
////	        System.out.println("Parent:" + file.getParent());
////	        System.out.println("Exists :" + file.exists());
//			
//			//creating a file
//			if(file.createNewFile()) {
//				 // apply File class methods on File object
//				System.out.println("File Created: " + file.getName());
//		        System.out.println("Path: " + file.getPath());
//		        System.out.println("Absolute path:"
//		                           + file.getAbsolutePath());
//		        System.out.println("Parent:" + file.getParent());
//		        System.out.println("Exists :" + file.exists());
//
//			}else {
//				System.out.println("File already exits ");
//			}
//			//writing text using FileWriter Class
//			FileWriter fW = new FileWriter("myFile.txt");
//			
//			//write some text inside a file
//			fW.write("Hello Sujal Taware this side!!!");
//			
//			//closing the resource
//			fW.close();
//			
//			System.out.println("Successfully written.");
//			
//			//using Scanner class read file data
		//Scanner class parse data into text format
//			Scanner read = new Scanner(file);
//			
//			
//			 // Traversing File Data
//			while(read.hasNext()) {
//				String data = read.nextLine();
//				System.out.println(data);
//			}
//			
//		}catch(Exception e) {
//			System.out.println(e.getMessage());
//		}
		
		

	}

}
