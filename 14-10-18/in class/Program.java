
public class Program {

	public static void main(String[] args) {

		int age = 23;
		int grade = 78;

		Student[] matrix = new Student[9];
		for (int i = 0; i < matrix.length; i++) {
			
			matrix[i] = new Student();
			 
		}
		for (int j = 0; j < matrix.length; j++) {
			System.out.println("Student"+(j+1)+": "+ matrix[j].toString());
		}
		Student.printAverages();   /*--->option 1<---*/
		 Program.printAverages();  /*--->option 2<---*/

	}
                                      
	public static void printAverages() {              /*--->option 2<---*/
		System.out.println("The average of age is: "+ Student.aveAge() +" The average of grade is: "+Student.aveGrade() );

	}

}
