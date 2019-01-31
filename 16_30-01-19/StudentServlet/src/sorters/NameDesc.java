package sorters;

import java.util.Comparator;

import bins.Student;

public class NameDesc implements Comparator<Student>{
	
	@Override
	public int compare(Student s1 , Student s2) {
		if(s1.getName().charAt(0)>s2.getName().charAt(0))
			return -1;
		else if(s1.getName().charAt(0)<s2.getName().charAt(0))
			return 1;
		else return 0;
	}
}
