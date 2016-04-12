package com.gabriel.test;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.TimeZone;

import com.google.common.base.Function;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ParseException
    {
    	
        final SimpleDateFormat nuevo = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S"); 
        
        System.out.println(nuevo.format( new Date() ));
        
        String.valueOf(null);
        
    	String original = "2016-04-05T12:12:08.646+01:00";
    	
    	SimpleDateFormat sdf =  new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
    	SimpleDateFormat sdf2 =  new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss:SSSXXX");
    	System.out.println(original.replaceAll( "0\\z", "CDD" ));
    	
    	
    	Date date = sdf.parse(original);
    	Calendar calendar = Calendar.getInstance();
    	calendar.setTime(date);
    	
    	System.out.println(Arrays.toString(TimeZone.getAvailableIDs()));
    	
    	int offset = (calendar.get(Calendar.ZONE_OFFSET) + calendar.get(Calendar.DST_OFFSET)) / (60 * 1000);
    	
    	calendar.add(Calendar.MINUTE, - offset );
    	System.out.println(calendar.getTime());
    	System.out.println(sdf2.format(calendar.getTime()));
    	
    	
    	
    	
    	
    	/*List<String> original = Lists.newArrayList("Uno", "Dos","Tres");
        System.out.println( "Hello World!" );
        Collection<String> changed =Collections2.transform(original, new Function<String, String>() {
			public String apply(String arg0) {
				return arg0+"_Change";
			}
		});
        
       System.out.println(original);
       System.out.println(original.add("4"));
       System.out.println(changed);*/
    	
    	
    	
       
    }
}
