package com.example.Day7.InputOutputStreams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DemoOnIOStream {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		//Character Stream example
//		BufferedReader reader=new BufferedReader(new FileReader("assets/data.txt"));
//		String data;
//		while((data=reader.readLine())!=null)
//			System.out.println(data);
//		BufferedWriter write=new BufferedWriter(new FileWriter("assets/data.txt",true));
//		write.newLine();
//		write.write("This is modified with buffered writer.");
//		write.close();
//	
		//Byte stream Example
//		FileOutputStream fos=new FileOutputStream("assets/info.txt",true);
//		String text="ani";
//		fos.write(text.getBytes());
//		fos.close();
		
		
		//approach 1
//		FileInputStream fis=new FileInputStream("assets/info.txt");
//		int b;
//		while ((b=fis.read())!=-1)
//			System.out.print((char)b);
//		fis.close();
		
		//approach 2
//		byte arr[]=new byte[(int) new File("assets/info.txt").length()];
//		fis.read(arr);
//		fis.close();
//		System.out.println(new String(arr));
		
		//Object Stream Example
//		Bottle bt =new Bottle(1,"Milton",2500,"Grey");
//		ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream("assets/Bottleinfo.txt"));
//		oos.writeObject(bt);
//		oos.close();
		
		ObjectInputStream ois =new ObjectInputStream(new FileInputStream("assets/Bottleinfo.txt"));
		Bottle bt1= (Bottle)ois.readObject();
		ois.close();
		System.out.println(bt1);
	
	}
	
}
