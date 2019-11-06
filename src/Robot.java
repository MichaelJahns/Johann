
public class Robot {
	private String name;
	private String title;
	private String organization;
	private boolean isLoyalToHumans;
	
	//Default Constructor, w/o parameters
	public Robot() {
		
	}
	//Constructor, w/ parameters
	public Robot(
			String name,
			String title,
			String organization,
			boolean isLoyalToHumans) 
	{
		this.name = name;
		this.title = title;
		this.organization = organization;
		this.isLoyalToHumans = isLoyalToHumans;
	};

	//Overrides
	@Override
	public String toString() {
		String output;
		output = this.name + " " + this.title + " of " + this.organization;
		return output;
	}
	//Getters 
	public String getName() {
		return name;
	}

	public String getTitle() {
		return title;
	}
	
	public String getOrganization() {
		return organization;
	}
	
	public boolean getLoyalityToHumans() {
		return isLoyalToHumans;
	}
	
	//Setters
	public void setName(String name) {
		this.name = name;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}
	
	public void setLoyalityToHumans(boolean isLoyalToHumans) {
		this.isLoyalToHumans = isLoyalToHumans;
	}


	

}
