package serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjects {
	public static void main(String[] args) {
		System.out.println("Writing Objects....");
		
		Person[] people = {new Person(1,"Jenifer"),new Person(2,"Mike"),new Person(3,"Bob")};
		
		// Write Objects to file 
		try(FileOutputStream fos = new FileOutputStream("people.txt"))
		{
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(people);
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
