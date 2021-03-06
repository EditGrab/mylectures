package lv.edite;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String inputStr = "abc030u304_9";
		String regexStrExp = "[a-z]+"; // ja ir + zime, tad sagrupe 030, var ielikt [a-z]
		
		System.out.println(inputStr.charAt(0));
		System.out.println(inputStr.charAt(1));
		
		Pattern pattern = Pattern.compile(regexStrExp);
		
		Matcher matcher = pattern.matcher(inputStr);
		
		while(matcher.find()){
			System.out.println("find() found substrng "+matcher.group());
		}

		
		String replaceSymbols = "lvaa"; //aizvietos ab ar lvaa
		String outputStr = matcher.replaceFirst(replaceSymbols);
		
		System.out.println(outputStr);
	}

}
