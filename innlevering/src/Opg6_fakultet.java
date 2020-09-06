
import java.util.Scanner;
import java.util.InputMismatchException;



public class Opg6_fakultet {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = 0;
		int loop = 0;
		int lopendeSum = 0;
		System.out.print("Skriv inn tallet du ønsker å ta fakultet av: ");
		
		//While loop for gyldig input
		while (loop == 0) {
			try {
				n = input.nextInt();				
				loop = 1;
			} catch (InputMismatchException e){
            System.out.print("Kun heltall! Prøv på nytt: ");
            input.nextLine();
			}
		}
		System.out.print("Fakultet av " + n + " != ");
		for (int i = 1; i <= n; i++) {
			if (i == 1) {
				lopendeSum = i; 
				System.out.print(i + " * ");

			} else if (i != n) {
				lopendeSum *= i;
				System.out.print(i + " * ");
				
			} else {
				lopendeSum *= i;
				System.out.print(i);
			}
		}
		System.out.print(" = " + lopendeSum);

	}

}
