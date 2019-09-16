/**
* Scans throught the auth.log file and will print out the information stored in the hashmaps.
* @author James Schwartz
* @version 1.0
* Programming Project One
* CS322 - Compiler Construction
* Spring 2019
*/

import java.util.*;
import java.io.*;

public class ScannerPrint{
	static FileSearch fileSearch = new FileSearch();
	static int countLines = 0;

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Which file in the directory would you like to search?");
		String filename = scanner.nextLine();

		read(filename);

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
