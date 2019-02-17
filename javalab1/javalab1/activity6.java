/* This program displays the population for each year for the next five years.
 * @amber
 * 1/14/19
 */
package javalab1;

public class activity6 {
	
	public static void main(String[] args)
	
	{
		
		double birthInSeconds = 7.0;
		double deathInSeconds = 13.0;
		double newImmigrant = 45.0;
		double currentPopulation = 312032486.0;
		
		double secondsInYears = 60 * 60 * 24 * 365;
		
		double numOfBirths = secondsInYears / birthInSeconds;
		double numOfDeaths = secondsInYears / deathInSeconds;
		double numOfImmigrants = secondsInYears / newImmigrant;
		
		for(int i = 1; i <= 5; i++) {
			
			currentPopulation += numOfBirths + numOfImmigrants - numOfDeaths;
			System.out.println("Year" + i + " = " + (int)currentPopulation);
		}
		
	}

}
