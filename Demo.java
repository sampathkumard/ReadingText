package com.sampathin;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
//import java.io.FileNotFoundException;

public class Demo {

	public static void main(String[] args) throws IOException {
//		FileReader fr = new FileReader("C:\\Sampanth\\sam.txt");
//		BufferedReader br = new BufferedReader(fr);
//		String str;
//		while((str=br.readLine())!=null) {
//			System.out.println(str);
//			
//		}
//		br.close();
		File f= new File("C:\\Sampanth\\sam.txt");
		Scanner sc = new Scanner(f);
		//while(sc.hasNextLine()) {
			//System.out.println(sc.nextLine());
		sc.useDelimiter("\\Z");
		System.out.println(sc.next());
		
	}
}


