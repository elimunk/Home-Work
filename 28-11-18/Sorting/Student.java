package sorting;

public class Student{

	private int grade;
	private int age;
	private String name;
	
	
	public Student(int grade, int age, String name) {
		setGrade(grade);
		setAge(age);
		setName(name);
	}
	
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade =(grade<=100 && grade>0)? grade:0 ;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age =(age<=120 && age>=18)? age:0 ;;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Name: " + getName()+ ", Grade: "+ getGrade()+
			", Age: " + getAge();
	}

}
