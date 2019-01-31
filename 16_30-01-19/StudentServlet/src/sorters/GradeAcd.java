package sorters;

import java.util.ArrayList;
import java.util.Comparator;

import bins.Student;

public class GradeAcd implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		return s1.getGrade()-s2.getGrade();
	}

}
