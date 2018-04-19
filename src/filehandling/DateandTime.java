package filehandling;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateandTime {
public static void main(String[] args) {
	Date date= new Date();
	System.out.println(date.toString());
	System.out.println(date.getTime());
	System.out.println(date.getDate());
	System.out.println(1900+date.getYear());
	System.out.println(date.getMonth()+1);
	System.out.println(date.getDay());
	System.out.println(date.getHours());

	
	SimpleDateFormat sdf= new SimpleDateFormat("E yyyy/mm/dd hh:mm:ss z");
	System.out.println(sdf.format(date));
}
}
