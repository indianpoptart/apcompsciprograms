package com.apcompsci.FileRead;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FindMovie
{
	public static void main(String args[]) throws IOException {

		String str;

		Scanner sc = new Scanner( System.in );
		System.out.print("Enter movie title -> ");
		String searchFor = sc.nextLine();

		
		System.out.println("Tell me filename");
		String fileName = sc.nextLine();
		
		FileReader fin = new FileReader(fileName);

		Scanner src = new Scanner(fin);
		int count = 0;

		while (src.hasNext()) {
			String in = src.nextLine();
			if(in.indexOf(searchFor) >= 0) { 
				System.out.println(searchFor + "found on line " + count);
				break;
			}
			else if(in.indexOf(searchFor) == -1){
				System.out.println(searchFor + " is an invalid movie title");
				break;
			}
			count++;
		}
	}
}