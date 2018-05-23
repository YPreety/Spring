package SetterWithDependent;

public class EmployeeSIDBean {

	private int id;
	private String name;
	private Address1 address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address1 getAddress() {
		return address;
	}

	public void setAddress(Address1 address) {
		this.address = address;
	}

	void display() {
		System.out.println("id=" + id + ", name=" + name);
		System.out.println(address);
	}
}
