package bins;

import java.util.ArrayList;

public class StudentArray {
//implements Comparator<Student>
	 ArrayList< Student> studentList = new ArrayList<>();
	
	public StudentArray() {
		studentList.add(new Student("Bob", 20, 75));
		studentList.add(new Student("Alice", 40, 42));
		studentList.add(new Student("Tom", 25, 80));
		studentList.add(new Student("Kuai", 34, 60));
		studentList.add(new Student("Gad", 56, 98));
		studentList.add(new Student("Lior", 4, 100));
		studentList.add(new Student("Dan", 80, 50));
		studentList.add(new Student("Elad", 11, 80));
		studentList.add(new Student("Tim", 6, 70));
		studentList.add(new Student("Abdulla", 35, 55));
	}

	public static  ArrayList< Student> minAge(int minAge, ArrayList< Student> list) {
		ArrayList< Student> newList = new ArrayList<>();
		for (int i=0; i<list.size(); i++) {
			if(list.get(i).getAge()>=minAge) {
				newList.add(list.get(i));
			}
		}return newList;
	}
	
	public static ArrayList< Student> maxAge(int maxAge, ArrayList< Student> list) {
		ArrayList< Student> newList = new ArrayList<>();
		for (int i=0; i<list.size(); i++) {
			if(list.get(i).getAge()<=maxAge) {
				newList.add(list.get(i));
			}
		}return newList;
	}
	
	public static ArrayList< Student> minGrade(int minGrade, ArrayList< Student> list) {
		ArrayList< Student> newList = new ArrayList<>();
		for (int i=0; i<list.size(); i++) {
			if(list.get(i).getGrade()>=minGrade) {
				newList.add(list.get(i));
			}
		}return newList;
	}
	
	public static ArrayList< Student> maxGrade(int maxGrade, ArrayList< Student> list) {
		ArrayList< Student> newList = new ArrayList<>();
		for (int i=0; i<list.size(); i++) {
			if(list.get(i).getGrade()<=maxGrade) {
				newList.add(list.get(i));
			}
		}return newList;
	}
	
	
	
}
