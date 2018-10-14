import java.util.Random;

public class Student {

	Random ran = new Random();

	private int age;
	private int grade;

	public int getAge() {
		return age;
	}
	public int getGrade() {
		return grade;
	}

	public static int sumOfGrade;
	public static int sumOfAge;
	public static int sumOfStudnts = 0;

	public Student() {
		this.age = ran.nextInt(41 - 18) + 18;
		this.grade = ran.nextInt(101 - 60) + 60;
		Student.sumOfAge += age;
		Student.sumOfGrade += grade;
		Student.sumOfStudnts++;
		;

	}

	public static int aveGrade() {
		return sumOfGrade / sumOfStudnts;
	}

	public static int aveAge() {
		return sumOfAge / sumOfStudnts;
	}

	public String toString() {
		return "Age: " + getAge() + ", Grade: " + getGrade();
	}

	public static void printAverages() { /*--->option 1<---*/
		System.out.println("The average of age is: " + aveAge() + " The average of grade is: " + aveGrade());

	}
}
