package ConstructorWithDependent;

public class EmployeeCIDBean {
	private int id;
	private String name;
	private Address ad;

	public EmployeeCIDBean(int id, String name, Address ad) {
		super();
		this.id = id;
		this.name = name;
		this.ad = ad;
	}

	void display() {
		System.out.println("id=" + id + ", name=" + name);
		System.out.println(ad.toString());
	}
}
