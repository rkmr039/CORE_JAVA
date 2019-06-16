package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadObjects {
	public static void main(String[] args) {
		System.out.println("Reading Objects...");
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("people.txt"))){
			
			
			Person[] people = (Person[])ois.readObject();
			
			@SuppressWarnings("unchecked") // Java is lost type information when we pass object to ArrayList<>

			ArrayList<Person> peopleList = (ArrayList<Person>)ois.readObject();
			
			
			for(Person person:people) {
				System.out.println(person);
			}
			for(Person person:peopleList) {
				System.out.println(person);
			}
			
			int num = ois.readInt();
			
			for(int i=0; i<num; i++) {
				Person person = (Person)ois.readObject();
				System.out.println(person);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
