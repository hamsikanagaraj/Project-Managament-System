package examples;

import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream; 
import java.io.FileOutputStream;


public class SerializationDemo {
	public static void main(String[] args) throws Exception {
		Person p=new Person("Polo",21);
		System.out.println(p);
		
		String path="src/pers  .txt";
		ObjectOutputStream ostream=null;
		ObjectInputStream istream=null;
		
		ostream=new ObjectOutputStream(new FileOutputStream(path));
		ostream.writeObject(p);
		ostream.close();
		System.out.println("Object Serialized...");
		
		istream=new ObjectInputStream(new FileInputStream(path));
		Object obj=istream.readObject();
		System.out.println(obj);
		istream.close();
		
	}

}
