import java.util.ArrayList;

public class Roster {
	ArrayList<Robot> robotRoster;
	
	public Roster() {
		this.robotRoster = new ArrayList<>();
	}
	
	public void addRobot(Robot newRobot) {
		this.robotRoster.add(newRobot);
	}
	
	public void updateRobot(
			String oldName, 
			String newName,
			String newTitle,
			String newOrganization,
			boolean newIsLoyalToHumans) {
		ArrayList<Robot> robotRoster = getRobotRoster();
		
		for(int i = 0; i < robotRoster.size(); i++) {
			if(robotRoster.get(i).getName().equals(oldName)) {
				Robot updateRobot = robotRoster.get(i);
				updateRobot.setName(newName);
				updateRobot.setTitle(newTitle);
				updateRobot.setOrganization(newOrganization);
				updateRobot.setLoyalityToHumans(newIsLoyalToHumans);
			}
		}
	}
	
	public void deleteRobot(String target) {
		ArrayList<Robot> robotRoster = getRobotRoster();
		
		for(int i = 0; i < robotRoster.size(); i++) {
			if(robotRoster.get(i).getName().equals(target)) {
				Robot removeRobot = robotRoster.get(i);
				robotRoster.remove(removeRobot);
			}
		}
	}
	
	public ArrayList<Robot> getRobotRoster(){
		return this.robotRoster;
	}

}
