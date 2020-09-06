
import java.util.Scanner;
import java.util.InputMismatchException;

public class Opg7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int score = 0;
		int b = 0;
		String grade = "";
		
		// For-loop to run through the 10 students
		for (int i = 1; i <= 10; i++) {
			b = 0;
			System.out.print("Student, "+ i + ". Write test-score: ");
			//While-loop so I stay on same student until correct input been applied
			while (b == 0) {
				try {
					score = input.nextInt();
					//F
					if (score <= 39) {
						grade = "F";
						
					// E
					} else if (score >= 40 && score <= 49) {
						grade = "E";
						
					//D
					} else if (score >= 50 && score <= 59) {
						grade = "D";
					
					//C
					} else if (score >= 60 && score <= 79) {
						grade = "C";
					
					//B
					} else if (score >= 80 && score <= 89) {
						grade = "B";

					//A
					} else if (score >= 90 && score <= 100) {
						grade = "A"; 
						
					//Above 100
					} else if (score > 101) {
						System.out.print("Score can't be more than 100! Write test-score: "+ "\n");
						score = input.nextInt();
					} b = 1;
					
				//Non int
				} catch (InputMismatchException e){
		            System.out.print("Only use integers! Write test-score: ");
		            input.nextLine();
				}

			} //end of while loop
			System.out.print("Student, "+ i + ", test-result: "+ grade + "\n");
			
		} //end of forloop
	}

}
