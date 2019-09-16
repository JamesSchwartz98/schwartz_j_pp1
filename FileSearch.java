/**
* Searches the designated file for the designated parameter from ScannerPrint.java.
* @author James Schwartz
* @version 1.0
* Programming Project One
* CS322 - Compiler Construction
* Spring 2019
*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Map;
import java.util.HashMap;

public class FileSearch{

	//map declaration to store ip addresses
	static HashMap<String, Integer> ipMap = new HashMap<String, Integer>();
	//map declaration to store the usernames
	static HashMap<String, Integer> users = new HashMap<String, Integer>();

	//method to parse out the designated types of desired outpu
	public static void parse(String line){
		/**IP Address Regex */
		String IPpattern = "(((\\d{3})|(\\d{2}))[.]){3}((\\d{3})|(\\d{2}))";
		/**create a pattern */
		Pattern IPp = Pattern.compile(IPpattern);
		/**create a match */
		Matcher IPm = IPp.matcher(line);

		/**assigning a value to each unique IP and increment how many times it appears*/
		if(IPm.find()){
			if(ipMap.containsKey(IPm.group(0))){
				int count = ipMap.get(IPm.group(0));
				ipMap.put(IPm.group(0), count+1);
			}/**end if */
			else{ipMap.put(IPm.group(0), 1);}/**end else */
		}/**end IP hashmap if */



		/**Usernames Regex*/
		String Userpattern = "user (([a-z]+|[A-Z]+|[0-9]+)+)";
		/**create a pattern */
		Pattern Userp = Pattern.compile(Userpattern);
		/**create a match */
		Matcher Userm = Userp.matcher(line);

		/**assigning a value to each unique username and incremenet how many times it appears*/
		if(Userm.find()){
		String buffer = Userm.group(0).substring(5);
			if(users.containsKey(buffer)){
				int count = users.get(buffer);
				users.put(buffer, count+1);
			}/**end if */
			else{users.put(buffer, 1);}/**end else*/
		}/**end username if*/

	}/**end parse method */

	//method to designate the  number of lines being parsed
	static int mapSize(HashMap<String, Integer> map){
		return map.size();
	}/**end mapSize method */

	//method to print out the values from the designated hashmap
	static void getMap(HashMap<String, Integer> map){
		for(String i : map.keySet()){
			System.out.println(i+" :"+map.get(i));
		} /**end for*/
	}/**end getMap method */
}/**end class*/
