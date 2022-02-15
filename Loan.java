import java.util.Date;

public class Loan {
	private double annualInterestRate = 2.5;
    private int numberOfYears = 1;
    private double loanAmount = 100;
    private Date loanDate = new Date();
    
    public Loan() {
		this.annualInterestRate = annualInterestRate;
		this.numberOfYears = numberOfYears;
		this.loanAmount = loanAmount;
	}
    
	public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
		this.annualInterestRate = annualInterestRate;
		this.numberOfYears = numberOfYears;
		this.loanAmount = loanAmount;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public int getNumberOfYears() {
		return numberOfYears;
	}

	public void setNumberOfYears(int numberOfYears) {
		this.numberOfYears = numberOfYears;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public Date getLoanDate() {
		return loanDate;
	}

	public void setLoanDate(Date loanDate) {
		this.loanDate = loanDate;
	}
	
	public double getMonthlyPayment() {
		double monthlyInterestRate = this.annualInterestRate/100/12;
		double monthlyPayment = (this.loanAmount*monthlyInterestRate)/(1-(1/Math.pow((1+monthlyInterestRate), this.numberOfYears*12)));
		return monthlyPayment;
	}
    
	public double getTotalPayment() {
		double monthlyPayment = getMonthlyPayment();
		double totalPayment = monthlyPayment * this.numberOfYears * 12;
		return totalPayment;
	}
    
}
