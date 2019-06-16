package serialization;

import java.io.Serializable;

public class Person implements Serializable {
	
	private static final long serialVersionUID = 1613555224584004025L;
	private transient int id; // transient keyword make variable non serializable
	private String name;
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	
	

}
