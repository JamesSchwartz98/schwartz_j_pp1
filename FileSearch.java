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
import java.util.Stack;

public class FileSearch{
	public static void parse(String line){
		/**regex */
		String pattern = "(((\\d{3})|(\\d{2}))[.]){3}((\\d{3})|(\\d{2}))";
		/**create a pattern */
		Pattern p = Pattern.compile(pattern);
		/**create a match */
		Matcher m = p.matcher(line);
		if(m.find()){
			System.out.println("found value: "+m.group(0));
		}/**end if */
	}/**end parse method */
}/**end class*/
