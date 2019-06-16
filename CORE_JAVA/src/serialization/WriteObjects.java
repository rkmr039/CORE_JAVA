package serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjects {
	public static void main(String[] args) {
		System.out.println("Writing Objects....");
		
		
		
		Person p1 = new Person(534, "Sonu");
		Person p2 = new Person(524, "Monu");
		
		System.out.println(p1);
		System.out.println(p2);
		
		// Write Objects to file 
		try(FileOutputStream fos = new FileOutputStream("people.txt"))
		{
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(p1);
			oos.writeObject(p2);
			
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
