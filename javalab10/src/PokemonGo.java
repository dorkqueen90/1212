package lastLab;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *The Driver class for your Pokemon Game
 * @author:
 */
public class PokemonGo {
    private static int healthPotions;
    private static int elixirs;
    
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);

        //Display starter Pokemon
        System.out.println("Professor Oaks: Welcome to POKEMONNNNN! Gotta catch 'em all!");
        System.out.println("Professor Oaks: Please select a starter pokemon:");
        System.out.println("1. Bulbasaur");
        System.out.println("2. Charmander");
        System.out.println("3. Squirtle");
        
        

        int StarterChoice = input.nextInt();
        System.out.println("");

        Pokemon chosen = new Pokemon("", "");
		switch (StarterChoice) {
            case 1:
                //Picked Bulbasaur
            	chosen = new Pokemon("Bulbasaur", "grass");

                System.out.println("Professor Oaks: Congratulations on your new Bulbasaur!");
                System.out.println("");
                break;
            case 2:
                //Picked Charmander
            	chosen = new Pokemon("Charmander", "fire");

                System.out.println("Professor Oaks: Congratulations on your new Charmander!");
                System.out.println("");
                break;
            case 3:
                //Picked Squirtle
            	chosen = new Pokemon("Squirtle", "water");

                System.out.println("Professor Oaks: Congratulations on your new Squirtle!");
                System.out.println("");
                break;
            default:
                break;
        }

        //Display the pokemon of choice's stats
    	System.out.println(chosen.getName() + ", " + chosen.getType()+", "+chosen.getHP()+" HP, "+chosen.getPP()+" PP.");

        
        System.out.println("\nNarrator: You have now entered the world of pokemon... ");

        //Start your game code here
        int menu = 0;
        System.out.println("1. Explore the tall grass");
        System.out.println("2. Visit the Poke Clinic");
        System.out.println("3. Check Backpack");
        System.out.println("4. Exit");
        System.out.println("What would you like to do: ");
        menu = input.nextInt();
        while(menu != 4)
        {
        	switch(menu)
        	{
        	case 1:
        		if(chosen.getHP() <= 0)
            	{
            		System.out.println("Your Pokemon has fainted, please visit the Poke Clinic.");
            		break;
            	}
        		explore(chosen);
        		break;
        	case 2:
        		clinic(chosen);
        		break;
        	case 3:
        		backpack();
        		break;
        	case 4:
        		break;
        	default:
        			
        	}
        	System.out.println("1. Explore the tall grass");
            System.out.println("2. Visit the Poke Clinic");
            System.out.println("3. Check Backpack");
            System.out.println("4. Exit");
            System.out.println("What would you like to do: ");
            menu = input.nextInt();
        }
        System.out.println("Goodbye");
    }
    public static void explore(Pokemon chosen)
    {
    	Scanner input = new Scanner(System.in);
    	System.out.println("A wild Pokemon appears.\n");
    	Pokemon wild = getWildPokemon();
    	System.out.println(wild.getName() + ", " + wild.getType()+", "+wild.getHP()+" HP.");
    	System.out.println("1. Attack");
        System.out.println("2. Run");
        System.out.println("3. Use Health Potion");
        System.out.println("4. Use Elixir");
    	int battle = 0;
    	battle = input.nextInt();
    	while(battle != 2)
    	{
    		switch(battle)
    		{
    		case 1:
    			chosen.attack(wild);
    			break;
    		case 2:
    			chosen.run();
    			break;
    		case 3:
    			useHealthPotion(chosen);
    			break;
    		case 4:
    			useElixir(chosen);
    			break;
    		default:
    				
    		}
    		wild.attack(chosen);
    		if(wild.getHP() < 0)
    		{
    			System.out.println("The wild "+wild.getName()+" has fainted, You win.");
    			break;
    		}
    		if(chosen.getHP() < 0)
    		{
    			System.out.println("Your "+chosen.getName()+" has fainted, You lose.");
    			break;
    		}
    		System.out.println("1. Attack");
            System.out.println("2. Run");
            System.out.println("3. Use Health Potion");
            System.out.println("4. Use Elixir");
        	
        	battle = input.nextInt();
    		
    	}
    }
    
    public  static void clinic(Pokemon chosen)
    {
    	chosen.setHP(100);
    	refillHealthPotions();
    	refillElixirs();
    	System.out.println("Your Pokemon is back to full health and all of your potions have been refilled.\n");
    }
    
    public static void backpack()
    {
    	System.out.println("You have "+healthPotions+" health potions and "+ elixirs + " elixirs in your bag.");
    }

    public static void useHealthPotion(Pokemon x) {
        if(healthPotions > 0)
        {
        	if(x.getHP() <= 80)
        	{
        		x.setHP(x.getHP()+20);
        	}
        	if(x.getHP() > 80)
        	{
        		x.setHP(100);
        	}
        	healthPotions--;
        	System.out.print("You have " + healthPotions + "health potions left.\n" );
        }
        else
        {
        	System.out.print("You are out of health potions. Visit a Poke Clinic to refill your bag.");
        }
    }

    public static void useElixir(Pokemon x) {
    	if(elixirs > 0)
        {
        	if(x.getPP() <= 5)
        	{
        		x.setPP(x.getPP()+5);
        	}
        	if(x.getPP() > 5)
        	{
        		x.setPP(10);
        	}
        	elixirs--;
        	System.out.print("You have " + elixirs + "elixirss left.\n" );
        }
        else
        {
        	System.out.print("You are out of health potions. Visit a Poke Clinic to refill your bag.");
        }
    }
    
    
    /**
     * resets your elixirs to 2
     */
    public static void refillElixirs() {
        elixirs = 2;
    }

    /**
     * resets your health potions to 4
     */
    public static void refillHealthPotions() {
        healthPotions = 4;
    }

    /**
     * Randomly selects a wild Pokemon for you to fight
     *
     * @return Pokemon
     */
    public static Pokemon getWildPokemon() {
        Pokemon[] temp = new Pokemon[4];
        temp[0] = new Pokemon("Pikachu", "electric", 1);
        temp[1] = new Pokemon("Oddish", "grass", 1);
        temp[2] = new Pokemon("Marill", "water", 1);
        temp[3] = new Pokemon("Magikarp", "electric", 1);

        int randomGen = (int) Math.random() * 5;

        return temp[randomGen];
    }

}
