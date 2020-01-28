package testData;

import java.util.List;

public class customer {
	 
	private String firstName;
    private String lastName;
    private int age;
    private String sex;
    private int experience;
    private String date;
    private String profession;
    private String automationTool;
    private List continents;
    private String seleniumCommands;
    
	// getters and setters
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	
	public String getAutomationTool() {
		return automationTool;
	}
	public void setAutomationTool(String automationTool) {
		this.automationTool = automationTool;
	}
	
	public List<String> getContinents() {
		return continents;
	}
	public void setContinents(List<String> continents) {
		this.continents = continents;
	}
	
	public String getSeleniumCommands() {
		return seleniumCommands;
	}
	public void setSeleniumCommands(String seleniumCommands) {
		this.seleniumCommands = seleniumCommands;
	}
}