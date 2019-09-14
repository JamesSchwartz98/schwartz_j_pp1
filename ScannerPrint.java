/**
* Scans throught the auth.log file and will print out the information stored in the hashmaps.
* @author James Schwartz
* @version 1.0
* Programming Project One
* CS322 - Compiler Construction
* Spring 2019
*/

import java.util.*;
import java.io.*

public class ScannerPrint{
	public static void main(String[] args){
		FileSearch filesearch = new FileSearch();
		System.out.println("Which file in the directory would you like to search?");
		switch(flag){
			case 0:
				System.out.println("Printing default results");
				break
			case 1:
				System.out.println("Printing the IP addresses");
				break
			case 2:
				System.out.println("Printing the usernames");
				break


	}/**end main method*/

	public static read(String file){
		try{
		Scanner scanner = new Scanner(system.in);
		File file = new File(input.nextLine());
		input = new Scanner(file);
		System,out,printlin(file);

		while(input.hasNextLine()){
			Stringline = input.nextLine();
		}/**end searching while loop */
		input.close();
		catch(Exception ex){
		ex.printStackTrace();
		}/**end catch */
	}/**end read method*/

}/**end class*/
