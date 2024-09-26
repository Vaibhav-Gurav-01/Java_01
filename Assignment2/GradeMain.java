package Assignment2;

public class GradeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExamGrade examgrade = new ExamGrade();

		examgrade.getData();
		System.out.println("____________________________");
		examgrade.avg();
		System.out.println("Yor Average is :" +examgrade.avg());
		examgrade.displayResult();
		System.out.println("____________________________");
	}

}
