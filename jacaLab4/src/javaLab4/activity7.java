package javaLab4;

public class activity7 {
	
	public static void main(String[] args) {
		
		//generate random int between 1 and 6
		int random = (int)((Math.random() * 6) + 1);
		System.out.println("Your number is: " + random);
		
		int random2 = (int)((Math.random() * 6) + 1);
		int random3 = (int)((Math.random() * 6) + 1);
		int random4 = (int)((Math.random() * 6) + 1);
		
		System.out.println("Your new rolls are: " + random2 + " \n" + random3 + " \n" + random4);
		
	}

}
