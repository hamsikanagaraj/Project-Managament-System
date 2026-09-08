import java.util.Comparator;
import java.util.TreeSet;

public class SortedPerson {
	public static void main(String[] args) {

		Comparator<Student> ageComp = (s1, s2) -> s1.getAge() - s2.getAge();
		Comparator<Student> nameComp=(s1, s2) -> s1.getName().compareTo(s2.getName());
		Comparator<Student> usnComp=(s1, s2) -> s1.getUsn().compareTo(s2.getUsn());
		
		TreeSet<Student> students = new TreeSet<Student>(nameComp);

		 students.add(new Student("Anu", "4MH23IS001", 19));
		 students.add(new Student("Mithu", "4MH23IS002", 21));
		 students.add(new Student("Hamsu", "4MH23IS003", 20));
		 students.add(new Student("Chand", "4MH23IS004", 22));

		students.forEach(System.out::println);
	}

}
