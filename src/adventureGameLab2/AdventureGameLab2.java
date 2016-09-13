// The app will create a story based on user-selected options. 
 
package adventureGameLab2;

import java.util.*;

public class AdventureGameLab2 {

	public static void main(String[] args) {
		
		String inputName;
		String choice;
	
		//user prompts to make game choices
		Scanner input = new Scanner(System.in);
		String encounter = " ", headCount = " ", weapon = " ", eyeColor = "", dragonName = "";
		
			System.out.println("Welcome! What is your name? (enter your name):  ");
			inputName = input.nextLine();
			System.out.println();
			
			System.out.println("Would you like to play a game? (enter y or n):  ");
			System.out.println();
			choice = input.nextLine(); //user input
			
			if (choice.equalsIgnoreCase("y")){
			System.out.println("Excellent! You are walking across a field and you encounter a fire breathing dragon! What would you do? (enter face the beast or run away) ");
		    encounter = input.nextLine();
		    System.out.println();
		    
		    {
			if (encounter.equalsIgnoreCase("face the beast")){
		    System.out.println("You approach the dragon.  You see that he has ___ heads. (enter 1 or 2 or 3) ");
		    headCount = input.nextLine();
			}else{
				System.out.println("You must be brave to face this type of beast.  You are not yet ready.");
			}
		    
			if(headCount.equalsIgnoreCase("1")){
			    System.out.println("No one has ever faced a 1-headed headed dragon before! Choose your weapon. (enter slingshot or sword or bow and arrow) ");
			    weapon = input.nextLine();
			}else if (headCount.equalsIgnoreCase("2")){
			    System.out.println("No one has ever faced a 2-headed dragon before! Choose your weapon. (enter slingshot or sword or bow and arrow) ");
			    weapon = input.nextLine();
			}else if(headCount.equalsIgnoreCase("3")){
		    System.out.println("No one has ever faced a 3-headed dragon before! Choose your weapon. (enter slingshot or sword or bow and arrow) ");
		    weapon = input.nextLine();
			}
		    
			if(weapon.equalsIgnoreCase("slingshot")){
			    System.out.println("Armed with your slingshot, you approach the dragon.  You can feel its fiery breath as you get closer.  It stares at you with its ___ eyes.");
			    eyeColor = input.nextLine();
			}else if(weapon.equalsIgnoreCase("sword")){
			    System.out.println("Armed with your sword, you approach the dragon.  You can feel its fiery breath as you get closer.  It stares at you with its ___ eyes.");
			    eyeColor = input.nextLine();
			}else if(weapon.equalsIgnoreCase("bow and arrow")){
		    System.out.println("Armed with your bow and arrow, you approach the dragon.  You can feel its fiery breath as you get closer.  It stares at you with its ___ (choose red or blue) eyes.");
		    eyeColor = input.nextLine();
			}
			
			if(eyeColor.equalsIgnoreCase("red")){
		    System.out.println("Oh thank goodness! Red-eyed dragons are friendly.  You pet it and become friends.  You name the dragon ___. (enter a name): ");
		    dragonName = input.nextLine();
			}else{
				System.out.println("Blue-eyed dragons have a big appetite for humans.  You're about to become lunch!Game over.");
			}
			    
		    	System.out.println(inputName + ", game over!");
		    input.close();//Scanner close
		    }
		    }
}
	}
		    
		 