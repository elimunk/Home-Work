package bins;

public class Student implements Comparable<Student>{

	private String name; 
	private int age;
	private  int grade;
	
	
	public Student(String name, int age, int grade) {
		
		setName(name);
		setAge(age);
		setGrade(grade);
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}


	@Override
	public int compareTo(Student s) {
		if(this.name.charAt(0)>s.getName().charAt(0))
			return 1;
		else if(this.name.charAt(0)<s.getName().charAt(0))
			return -1;
		else return 0;
	}
	@Override
	public String toString() {
		return "[ name: "+getName()+", grade: "+getGrade()+", age: "+getAge()+" ]";
	}
}
