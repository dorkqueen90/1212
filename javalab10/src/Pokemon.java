package lastLab;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author: 
 * @version: 
 * @description:A simple Pokemon class with HP, PP, health potions,
 * elixirs, a name, and type. The Pokemon can run, defend, attack, and go to the
 * PokeClinic.
 */
public class Pokemon {

    //Variables every Pokemon should have
    private int HP; //Health Points
    private int PP; //Power Points
    private String name;
    private String type;

    /**
     * Default Pokemon constructor
     * 
     * name is set to the passed parameter name
     * type is set to the passed parameter type
     * HP is set to 100
     * PP is set to 10
     * healthPotions is set to 4
     * elixirs is set to 2
     */
    public Pokemon(String name, String type) {
        this.name = name;
        this.type = type;

        HP = 100;
        PP = 10;
        //healthPotions = 4;
        //elixirs = 2;
    }

    /**
     * A special constructor so wild pokemon can attack forever
     * You can ignore this constructor
     */
    public Pokemon(String name, String type, int i) {
        this.name = name;
        this.type = type;

        HP = 100;
        PP = 10000;
    }

    /**
     * Attacks a Pokemon based on the defending Pokemon's defense and attacking Pokemon's PP
     * @param defender The Pokemon who is defending
     */
    public void attack(Pokemon defender) {
          if (PP > 0) { //If the attaking Pokemon still has Power Points left
            if (defender.defend()) { //If the defending pokemon sucessfully defends
                System.out.println(name + " missed.");
                System.out.println("");
            } else { //Else if the defending pokemon fails to defend
                int attackDamage = (int) (Math.random() * 25) + 1;
                defender.setHP(defender.getHP() - attackDamage);
                PP--;

                //If statement to display effectiveness
                if (attackDamage > 20) {
                    System.out.println(name + "'s attack was super effective! It did " + attackDamage + " damage to " + defender.getName());
                } else if (attackDamage < 10) {
                    System.out.println(name + "'s attack was not very effective. It did " + attackDamage + " damage to " + defender.getName());
                } else {
                    System.out.println(name + " did " + attackDamage + " damage to " + defender.getName());
                }
                
                System.out.println(defender.getName() + " has " + defender.getHP() + " HP.");
                System.out.println("");
            }
        } else { //Else if the attacking Pokemon is out of Power Points
            System.out.println(name + " is out of Power Points, use an elixir to restore their PP");
            System.out.println("");
        }
    }
    
    /**
     * Generates a 50/50 chance for your pokemon to run away
     * @return True if the Pokemon got away, False if they were unable to run
     */
    public boolean run() {
        int escape = (int) (Math.random() * 2)+1;
        if(escape > 1){
        	return true;
        }
        else{
		return false;
        }
    }
    
    /**
     * Generates a number for whether the defending Pokemon successfully defended
     * @return True if the Pokemon successfully defended, False if the Pokemon failed to defend
     */
    private boolean defend() {
        int defendStatus = (int) (Math.random() * 5);

        if (defendStatus < 2) {
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * Returns the Pokemon's current Health Points
     * @return HP
     */
    public int getHP() {
        return HP;
    }

    /**
     * Sets the Pokemon's HP, helpful when attacking
     * @param HP 
     */
    public void setHP(int HP) {
        this.HP = HP;
    }

    /**
     * Returns the Pokemon's current Power Points
     * @return PP
     */
    public int getPP() {
        return PP;
    }

    /**
     * Sets the Pokmeon's PP
     * @param PP
     */
    public void setPP(int PP) {
        this.PP = PP;
    }
    
    /**
     * Returns the Pokemon's name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the Pokemon's type
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * Prints out all the Pokemon variables, useful for testing
     */
    @Override
    public String toString() {
        return "Pokemon{" + "HP=" + HP + ", PP=" + PP + ", name=" + name + ", type=" + type + '}';
    }
}