package sorters;

import java.util.Comparator;

import bins.Student;

public class AgeAcd implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
return s1.getAge()-s2.getAge();
	}
}
