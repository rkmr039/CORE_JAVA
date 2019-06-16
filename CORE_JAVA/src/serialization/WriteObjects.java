package serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteObjects {
	public static void main(String[] args) {
		System.out.println("Writing Objects....");
		
		Person[] people = {new Person(1,"Jenifer"),new Person(2,"Mike"),new Person(3,"Bob")};
		
		ArrayList<Person> peopleList = new ArrayList<Person>(Arrays.asList(people));
		
		// Write Objects to file 
		try(FileOutputStream fos = new FileOutputStream("people.txt"))
		{
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(people);
			oos.writeObject(peopleList);
			
			oos.writeInt(peopleList.size());
			
			for(Person person:peopleList) {
				oos.writeObject(person);
			}
			
			oos.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
