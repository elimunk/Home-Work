package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Program {
	
	public static void main(String[] args) {
		Random ran = new Random();
		
		ArrayList<Student> list = new ArrayList<>();
		String[] names = new String[]{"Eli", "Anna", "Tom", "Bob", "Alice"};
		
		for (int i = 0; i <5; i++) {
			list.add(new Student(ran.nextInt(100- 0) + 0, ran.nextInt(120- 18) + 18, names[i]));
		}
		System.out.println("-------------------Before Sorting-------------\n");
		list.forEach(System.out::println);

		Collections.sort(list);
		
		System.out.println("\n-----------------After Age Sort---------------\n");
		list.forEach(System.out::println);
		
		Collections.sort(list, new StudentGradeSorter());
		
		System.out.println("\n-----------------After Grade Sort-------------\n");
		list.forEach(System.out::println);
			
		Collections.sort(list, new StudentNameSorter());
		System.out.println("\n-----------------After Name Sort-------------\n");
		list.forEach(System.out::println);

	}

}
