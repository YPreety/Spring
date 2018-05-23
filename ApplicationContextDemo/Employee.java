package ApplicationContextDemo;

public class Employee {

	private String name;
	private int id;
	private String email;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void displayInfo() {
		System.out.println("ID: " + id + " Name : " + name + "  Email id : " + email);
	}
}
