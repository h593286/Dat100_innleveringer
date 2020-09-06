
import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.Math.*;


public class Opg7_m_array {

	public static void main(String[] args) {
		//Creating variables and array
		Scanner input = new Scanner(System.in);
		String gradeArray [] = {"F","F","F","F","E","D","C","C","B","A","A"};
		int score = 0;
		int b = 0;
		String grade = "";
		
		// For-loop to run through the 10 students
		for (int i = 1; i <= 10; i++) {
			
			b = 0;
			System.out.print("Student, "+ i + ". Write test-score: ");
			
			while (b == 0) {
				try { 
					score = input.nextInt();
					if (score < 10) {
						grade = "F"; 
						
					} else if (score > 100 || score < 0) {
						System.out.print("Score can't be more than 100 or less than 0! Write test-score: "+ "\n");
						score = input.nextInt();
						
					} else {
						grade = gradeArray[score/10]; 
						
					} 
					b = 1;  //stops while loop
					
				} catch (InputMismatchException e){
		            System.out.print("Only use integers! Write test-score: ");
		            input.nextLine();
				}
			} //end of while loop
			System.out.print("Student, "+ i + ", test-result: "+ grade + "\n");
		} //end of for loop
		
	}
	

}
