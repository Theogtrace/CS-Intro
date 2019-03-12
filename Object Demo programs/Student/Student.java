import java.util.Scanner;
public class Student

{

	private String name;

	private int numberOfStudents;

	private int quiz;

	private int quizz;

	private int midTermExam;

	private int finalExam;

	private double finalScore;

	private char grade;	
	
	private double qui;

	public void readInput()

	{

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter student name");

		name= keyboard.nextLine();

		System.out.println("Enter quiz1 score:");

		quiz= keyboard.nextInt();
		
		while (quiz < 0 || quiz > 100)
		{
			System.out.println("Invaled quiz grade");
			System.out.println("Please reenter quiz grade");
			quiz = keyboard.nextInt();
		}

		System.out.println("Enter quiz2 score:");

		quizz= keyboard.nextInt();
		
		while (quizz < 0 || quizz > 100)
		{
			System.out.println("Invaled quiz grade");
			System.out.println("Please reenter quiz grade");
			quizz = keyboard.nextInt();
		}

		System.out.println("Enter your midterm exam score");

		midTermExam = keyboard.nextInt();
		
		while (midTermExam < 0 || midTermExam > 100)
		{
			System.out.println("Invaled midterm grade");
			System.out.println("Please reenter midterm grade");
			midTermExam = keyboard.nextInt();
		}

		System.out.println("Enter final exam score");

		finalExam= keyboard.nextInt();
		
		while (finalExam < 0 || finalExam > 100)
		{
			System.out.println("Invaled finalexam grade");
			System.out.println("Please reenter finalexam grade");
			finalExam = keyboard.nextInt();
		}

	}

	public void calculate()

	{
		qui = ((quiz/100) + (quizz/100)) * .25;
		finalScore=( qui + ((midTermExam/100)*.25)  + ((finalExam/100)*.50)); 

		if(finalScore >=90)

			grade = 'A';

		else if(finalScore >=80)

			grade = 'B';

		else if(finalScore >=70)

			grade = 'C';

		else if(finalScore >=60)

			grade = 'D';

		else

			grade = 'F';
	}
	
	public void output()
	{
		System.out.println("Studen" + " " + name );
		System.out.println("Quiz 1" + " " + quiz);
		System.out.println("Quiz 2" + " " + quizz);
		System.out.println("Midterm exam" + " " + midTermExam);
		System.out.println("Final exam" + " " + finalExam);
		System.out.println("The total score is" + " " + finalScore);
		System.out.println("Your letter grade is " + grade);
	}
}