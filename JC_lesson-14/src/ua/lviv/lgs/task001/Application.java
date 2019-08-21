package ua.lviv.lgs.task001;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Application {

	public static void main(String[] args) {

		Set<Student> setofStudents = new LinkedHashSet<>();
		setofStudents.add(new Student("Oliver", 21));
		setofStudents.add(new Student("Jack", 22));
		setofStudents.add(new Student("Harry", 26));
		setofStudents.add(new Student("Jacob", 28));
		setofStudents.add(new Student("Charlie", 21));
		setofStudents.add(new Student("Thomas", 23));
		setofStudents.add(new Student("George", 24));
		setofStudents.add(new Student("Oscar", 25));
		setofStudents.add(new Student("James", 21));
		setofStudents.add(new Student("William", 25));
		setofStudents.add(new Student("George", 24));
		setofStudents.add(new Student("Oscar", 25));
		setofStudents.add(new Student("James", 21));
		setofStudents.add(new Student("William", 25));

		for (Student student : setofStudents) {
			System.out.println(student);
		}
		System.out.println();
		System.out.println("/****************************************/");
		System.out.println();

		TreeSet<Student> sortedStudents = new TreeSet<>(new AllFieldsComparator());
		sortedStudents.addAll(setofStudents);

		for (Student student : sortedStudents) {
			System.out.println(student);
		}

	}

}
