package TestJava;

import java.util.Calendar;

public class DateString {

public static void main(String[] args) {
	String dateTime ="12/07/2014 2:00 PM";
	String date_dd_MM_yyyy[] = (dateTime.split(" ")[0]).split("/");
	for(String a:date_dd_MM_yyyy)
	System.out.println(a);
	System.out.println(dateTime.split(" ")[0]);
	System.out.println(Calendar.getInstance().get(Calendar.YEAR));
	int yearDiff = Integer.parseInt(date_dd_MM_yyyy[2])- Calendar.getInstance().get(Calendar.YEAR);
	System.out.println(yearDiff);
	
}
}
