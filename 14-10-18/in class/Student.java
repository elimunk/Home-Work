
public class Student {
private int age;
private int grade;

public static  int sumOfGrade;
public static  int sumOfAge;
public static  int sumOfStudnts=0;

public Student(int age, int grade) {
	this.age = age;
	this.grade = grade;
	Student.sumOfAge+=age;
	Student.sumOfGrade+=grade;
	Student.sumOfStudnts++;;
	
}

public static int aveGrade(){
	return sumOfGrade/sumOfStudnts;
}

public static int aveAge(){
	return sumOfAge/sumOfStudnts;
}


}
