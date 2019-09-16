/**
* Scans throught a file designated by the user, searches for specific criteria and will print out the desired information stored in the hashmaps.
* @author James Schwartz
* @version 1.0
* Programming Project One
* CS322 - Compiler Construction
* Spring 2019
*/

import java.util.*;
import java.io.*;

public class ScannerPrint{

	//calling on the FileSearch class in order to parse out with regex
	static FileSearch fileSearch = new FileSearch();
	//initializing a counter function to track how many lines are in the file
	static int countLines = 0;

	public static void main(String[] args){

	//asking the user which file they would like to search through
		Scanner scanner = new Scanner(System.in);
		System.out.println("Which file in the directory would you like to search?");
		String filename = scanner.nextLine();

	//reads the file
		read(filename);

	//asking the user what parameter they would like to designate to search for and passing it onto a switch statement to call on the different hashmaps to be displayeed
		System.out.println("What parameter would you like to search for? 0 - general results, 1 - Search for IPv4 addresses, 2 - Search for usernames");
		Scanner cases = new Scanner(System.in);
		int searchCase;
		searchCase = cases.nextInt();

		switch(searchCase){
			case 0:
				System.out.println(countLines+" lines in the log file were parsed.");
				System.out.println("There are "+fileSearch.mapSize(fileSearch.ipMap)+" unique IP addresses in the log.");
				System.out.println("There are "+fileSearch.mapSize(fileSearch.users)+" unique users in the log.");
				break;
			case 1:
				fileSearch.getMap(fileSearch.ipMap);
				System.out.println(countLines+" lines in the log file were parsed.");
				System.out.println("There are "+fileSearch.mapSize(fileSearch.ipMap)+" unique IP addresses in the log.");
				System.out.println("There are "+fileSearch.mapSize(fileSearch.users)+" unique users in the log.");
				break;
			case 2:
				fileSearch.getMap(fileSearch.users);
				System.out.println(countLines+" lines in the log file were parsed.");
				System.out.println("There are "+fileSearch.mapSize(fileSearch.ipMap)+" unique IP addresses in the log.");
				System.out.println("There are "+fileSearch.mapSize(fileSearch.users)+" unique users in the log.");
				break;
			default:
				System.out.println(countLines+" lines in the log file were parsed.");
				System.out.println("There are "+fileSearch.mapSize(fileSearch.ipMap)+" unique IP addresses in the log.");
				System.out.println("There are "+fileSearch.mapSize(fileSearch.users)+" unique users in the log.");
		}/**end switch statement */

		System.out.println("End of Search");
	}/**end main method*/

	//method to read throught the file, pass the information onto FileSearch class and count the lines in the file
	public static void read(String filename){
		try{
			File file = new File(filename);
			Scanner scanner = new Scanner(file);
			while(scanner.hasNextLine()){
				String buffer = scanner.nextLine();
				fileSearch.parse(buffer);
				countLines++;
			}/**end searching while loop */
			scanner.close();
		}/**end try */
		catch(Exception ex){
			ex.printStackTrace();
		}/**end catch */
	}/**end read method*/

}/**end class*/
