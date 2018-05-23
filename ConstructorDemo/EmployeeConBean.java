package ConstructorDemo;

public class EmployeeConBean {
	public EmployeeConBean(int id) {
		this.id = id;
	}

	private String name;
	private int id;
	private String city;
	
	public EmployeeConBean(String name, int id, String city) {
		super();
		this.name = name;
		this.id = id;
		this.city = city;
	}

	public EmployeeConBean(String name) {
		this.name = name;
	}

	public EmployeeConBean(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	void display() {
		System.out.println("id : " + id + " name: " + name + " city: " + city);
	}

}
