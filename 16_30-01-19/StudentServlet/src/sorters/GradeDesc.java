package sorters;

import java.util.Comparator;

import bins.Student;

public class GradeDesc implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		return s2.getGrade()-s1.getGrade();
	}

}
