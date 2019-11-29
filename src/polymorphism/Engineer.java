package polymorphism;

class Employee {
	public String name;
	public String grade;
	
	public Employee() {
		return;
	}
	
	public Employee(String name) {
		this.name = name;
	}
 
}

public class Engineer extends Employee {
	/*public Engineer(String name) {
		super(name);
	}*/
	private String skillset;
	
	public String getSkillset() {
		return skillset;
	}
	public void setSkillset(String skillset) {
		this.skillset = skillset;
	}
	

}
