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
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.println("Which file in the directory would you like to search?");
		String filename = scanner.nextLine();

		read(filename);

/**		switch(flag){
			case 0:
				System.out.println("Printing default results");
				break
			case 1:
				System.out.println("Printing the IP addresses");
				break
			case 2:
				System.out.println("Printing the usernames");
				break
*/

	}/**end main method*/

	public static void read(String filename){
		try{
			File file = new File(filename);
			Scanner scanner = new Scanner(file);
			while(scanner.hasNextLine()){
				System.out.println(scanner.nextLine());
			}/**end searching while loop */
			scanner.close();
		}/**end try */

		catch(Exception ex){
			ex.printStackTrace();
		}/**end catch */
	}/**end read method*/

}/**end class*/
