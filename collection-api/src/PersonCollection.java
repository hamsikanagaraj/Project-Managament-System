import java.util.Vector;

public class PersonCollection {
	public static void main(String[] args) {
		Vector<Person1> people=new Vector<Person1>();
		
		Person1 p1=new Person1("Polo",21);
		people.add(p1);
		
		people.add(new Person1("Mona",32));
		people.add(new Person1("Frunk",43));
		
		people.forEach(System.out::println);
		
		
	}

}
