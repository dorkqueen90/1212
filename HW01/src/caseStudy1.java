/*
 * @author Amber Sibel
 * @version 1/26/2019
 * This program should display the current time
 * How did I obtain the current second, minute, and hour?
 * - When I invoked System.currentTimeMillis(), I obtained the current time in milliseconds,
 * - I then used division and remainder to come up with the rest of the values
 * 
 * Steps include:
 * Add assignment ID
 * Obtain total milliseconds since midnight, Jan 1, 1970
 * Obtain the total seconds since midnight, Jan 1, 1970
 * Compute the current second in the minute in the hour
 * Obtain the total minutes
 * Compute the current minute in the hour
 * Obtain the total hours
 * Compute the current hour
 * Display results
 */
public class caseStudy1 {

public static void main(String[] args) {
		
		System.out.println("ID001");
		
		long totalMilliseconds = System.currentTimeMillis();
		
		long totalSeconds = totalMilliseconds / 1000;
		long currentSecond = totalSeconds % 60;
		
		long totalMinutes = totalSeconds / 60;
		long currentMinute = totalMinutes % 60;
		
		long totalHours = totalMinutes / 60;
		long currentHour = totalHours % 24;
		
		System.out.println("The current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " EST");
}
		
}
