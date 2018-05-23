package ConstructorWithCollectionList;

import java.util.Iterator;
import java.util.List;

public class Questions {

	private int id;
	private String name;
	private List<String> answer;

	public Questions() {

	}

	public Questions(int id, String name, List<String> answer) {
		super();
		this.id = id;
		this.name = name;
		this.answer = answer;
	}
	
	public void displayInfo(){
		System.out.println("id: "+ id + " name: "+name);
		System.out.println("Answers...");
		Iterator<String> itr = answer.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
	}
}
