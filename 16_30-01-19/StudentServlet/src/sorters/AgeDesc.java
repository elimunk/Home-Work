package sorters;

import java.util.Comparator;

import bins.Student;

public class AgeDesc implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		return s2.getAge()-s1.getAge();
	}

}
