package com.apcompsci.Band;

import java.util.ArrayList;
import java.util.Scanner;

public class HallOfFame {
	private static final Object[] String = null;
	private static Scanner scan;
	static ArrayList<Band> bandList = new ArrayList();

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		hall();
	}
	//search menu method
	private static void search(){
		System.out.println("What would you like to search");
		System.out.println("A: Band Name");
		System.out.println("B: Band Members");
		System.out.println("C: Band Genre");
		System.out.println("D: Other");
		String searchResponse = scan.next();
		//asks user for choice a answers
		if(searchResponse.equalsIgnoreCase("A")){
			//band name search incomplete
			System.out.println("Tell me the band name");
			String nameOfBand = scan.next();
			for(int i = 0; i <= bandList.size(); i++){
				for (Band nameO : bandList){
					if (bandList.contains(nameOfBand)){
						System.out.println(nameOfBand + " is in the hall of fame");
						search();
						break;
					}
					else if(!bandList.contains(nameOfBand)){
						System.out.println("That band is not in the hall of fame");
						search();
						break;
					}
					else{
						System.out.println("That band is not in the hall of fame");
						break;
					}
				}
				search();
			}
		}
		//this search is incomplete
		else if(searchResponse.equalsIgnoreCase("B")){
			System.out.println("Tell me a band member");
			String bandMember = scan.next();
		}
		else if(searchResponse.equalsIgnoreCase("C")){
			System.out.println("Tell me genre");
			searchResponse = scan.next();
			
		}
		else if(searchResponse.equalsIgnoreCase("D")){
			System.out.println("Tell me something to search");
			searchResponse = scan.next();
			if(searchResponse.equalsIgnoreCase("Year")){
				System.out.println("What year would you like to search for");
			}
		}

	}
	//main menu method
	public static void hall(){
		if (bandList.size() == 0){
			System.out.println("The hall of fame is empty");
		}
		else{
			System.out.println("The hall of fame has " + bandList.size() + " bands");
		}
		System.out.println("What would you like to do");
		System.out.println("A: Add Band");
		System.out.println("B: Remove Band");
		System.out.println("C: Edit Band");
		System.out.println("D: Clear Hall of Fame");
		System.out.println("E: Search");
		System.out.println("F: Quit");
		System.out.println("G: Open file");//do not need
		String answer = scan.next();

		if(answer.equalsIgnoreCase("A")){
			System.out.println("Tell me the band name");
			String name = scan.next();
			Band b1 = new Band(name);
			bandList.add(b1); 
			System.out.println("What genre is " + name);
			String genreOfBand = scan.next();
			b1.setGenre(genreOfBand);
			System.out.println("How many members are there in " + name + "?");
			int numberOfMembers = scan.nextInt();
			b1.setNumberOfMembers(numberOfMembers);
			//asks user for each members band name
			for(int i = 1; i <= numberOfMembers; i++){
				System.out.println("What is the name of member " + i);
				String nameOfMemb = scan.next();//Does not work at the moment
				b1.setnameOfMembers(nameOfMemb);
			}
			System.out.println("Is this band active? Y/N");
			String active = scan.next();
			if(active.equalsIgnoreCase("Y") || active.equalsIgnoreCase("Yes")){
				b1.isActive(true);
			}
			else{
				b1.isActive(false);
			}
			bandList.get(0);
			String bandInfo = b1.toString();
			System.out.println(bandInfo);
			
			
			hall();// goes back to main menu
		}
		else if(answer.equalsIgnoreCase("B")){
			System.out.println("What is the band name you want to remove");
			String nameOfBand = scan.next();
			bandList.remove(1);
		}
		//removes a specific band from the hall of fame
		else if(answer.equalsIgnoreCase("C")){
			System.out.println("What band would you like to remove from the hall of fame");
			String bandToEdit = scan.next();
			
		}
		//erases hall of fame list
		else if(answer.equalsIgnoreCase("D")){
			//Asks user if they really want to remove the hall of fame
			System.out.println("Are you sure you want to erase the hall of fame. Y/N");
			String eraseAnswer = scan.next();
			if(eraseAnswer.equalsIgnoreCase("Y")){
				bandList.clear();
				System.out.println("You have deleted the hall of fame");
				hall();
			}
			else if(eraseAnswer.equalsIgnoreCase("N")){
				hall();
			}
		}
		else if(answer.equalsIgnoreCase("E")){
			search();
		}
		else if(answer.equalsIgnoreCase("F")){
			System.exit(0);
		}
		else if(answer.equalsIgnoreCase("G")){
			IO.openFile();
		}
		else {
			hall();
		}
	}

}
