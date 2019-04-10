package TestJava;

import java.util.regex.Pattern;

public class PatternMatcher {
	public void string1()
	{
		String text= "geeks1for2geeks3";
		String delimter="\\d";
		Pattern pattern = Pattern.compile(delimter,Pattern.CASE_INSENSITIVE);
		String[] result= pattern.split(text);
		for(String a: result)
	System.out.println(a);
	}
public static void main(String[] args) {
	  // Following line prints "true" because the whole 
    // text "geeksforgeeks" matches pattern "geeksforge*ks" 
    System.out.println (Pattern.matches("geeksforge*ks", 
                                        "geeksforgeeks")); 

    // Following line prints "false" because the whole 
    // text "geeksfor" doesn't match pattern "g*geeks*" 
    System.out.println (Pattern.matches("g*geeks*", 
                                        "geeksfor"));
    PatternMatcher pm = new PatternMatcher();
    pm.string1();
}
}
