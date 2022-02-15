import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter annual interest rate, for example, 8.25: ");
		double interestRate = sc.nextDouble();
		System.out.print("Enter number of years as an integer: ");
		int years = sc.nextInt();
		System.out.print("Enter loan amount, for example, 120000.95: ");
		double loanAmt = sc.nextDouble();
		
		Loan a = new Loan(interestRate, years, loanAmt);
		System.out.println("The loan was created on " + a.getLoanDate());
		System.out.printf("The monthly payment is %.2f", a.getMonthlyPayment());
		System.out.printf("\nThe total payment is %.2f", a.getTotalPayment());
		sc.close();
	}
}
