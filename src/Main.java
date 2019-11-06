import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Michael
 *
 */
public class Main {

	public static void main(String[] args)
	{
		Roster roster = new Roster();
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to the Robot Fight Federation");		
		System.out.println();
		
		char selection;
		
		do
		{
			printMenu();
			selection = keyboard.nextLine().toLowerCase().charAt(0);
			System.out.println();
			
			switch(selection)
			{
			case 'a' :
					Robot newRobot = new Robot();
					System.out.println("~~~~ Adding New Robot ~~~~");
					System.out.print("Enter Robots's Name: ");
					newRobot.setName(keyboard.nextLine());
					
					System.out.print("Enter Robot's Title: ");
					newRobot.setTitle(keyboard.nextLine());
					
					System.out.print("Enter Robots's Organization: ");
					newRobot.setOrganization(keyboard.nextLine());
					
					System.out.print("Enter Robots Loyality to Humans");
					System.out.print(" F for Hostile, T for Friendly ");
					// Using a non primitive char, in order to use built in method .equals
					Character loyalitySelection;
					loyalitySelection = keyboard.nextLine().toLowerCase().charAt(0);
					
					if(loyalitySelection.equals('f')) {
						newRobot.setLoyalityToHumans(false);
					} else if(loyalitySelection.equals('t')) {
						newRobot.setLoyalityToHumans(true);
					} else {
						System.out.println("Please enter either a t or an f");
						continue;
					}
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					
					roster.addRobot(newRobot);
					break;
			
			case 'r' :
				System.out.println("~~~~~~~~~ Remove Robot ~~~~~~~~~");
				System.out.print("Enter Robots's name:");
				String targetRobot = keyboard.nextLine();
				roster.deleteRobot(targetRobot);
				break;
			
			case 'u' :
				System.out.println("~~~~~~~~~ Updating Robot ~~~~~~~~~");
				System.out.print("Enter Robot's Old Name: ");
				String robotNameOld = keyboard.nextLine();
				System.out.print("Enter Robot's New Name: ");
				String robotNameNew = keyboard.nextLine();
				System.out.print("Enter Robot's Title: ");
				String robotTitleNew = keyboard.nextLine();
				System.out.println("Enter Robot's new Organization: ");
				String robotOrganizationNew = keyboard.nextLine();
				
				System.out.print("Enter Robots Loyality to Humans");
				System.out.print(" F for Hostile, T for Friendly ");
				Character newLoyalitySelection;
				boolean newLoyality;
				newLoyalitySelection = keyboard.nextLine().toLowerCase().charAt(0);
				
				if(newLoyalitySelection.equals('f')) {
					newLoyality = false;
				} else if(newLoyalitySelection.equals('t')) {
					newLoyality = true;
				} else {
					System.out.println("Please enter either a t or an f");
					continue;
				}
				
				keyboard.nextLine();
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				
				roster.updateRobot(robotNameOld, robotNameNew, robotTitleNew, robotOrganizationNew, newLoyality);
				break;
				
			case 'p' :
				ArrayList<Robot> allRobots = roster.getRobotRoster();
				for(int i = 0; i < allRobots.size(); i++) {
					System.out.println(allRobots.get(i).toString());
				}
				
			case 'q' :
				break;
			
			default :
				System.out.println("This is not a valid option!");
				break;
			}
		} while(true);
	}
	
	public static void printMenu() {
		System.out.println("\n\n\n-----MAIN MENU----");
		System.out.println("a - Add Robot");
		System.out.println("r - Remove Robot");
		System.out.println("u - Update Robot");
		System.out.println("p - Print all Robots");
		System.out.println("q - Quit");
		System.out.print("\nChoose an option: ");

	}
	

}
