import java.util.Scanner;
public class CompoundInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter annual interest rate (in percentage): ");
        double annualInterestRate = scanner.nextDouble();
        System.out.print("Enter time period in years: ");
        double timeInYears = scanner.nextDouble();
        System.out.print("Enter the number of times interest is compounded per year: ");
        int compoundFrequency = scanner.nextInt();
        double compoundInterest = calculateCompoundInterest(principal, annualInterestRate, timeInYears, compoundFrequency);
        int compoundInterestAsInteger = (int) compoundInterest;
        System.out.println("Compound Interest (rounded to integer): " + compoundInterestAsInteger);// Close the scanner
    }
    static double calculateCompoundInterest(double principal, double annualInterestRate, double timeInYears, int compoundFrequency) {
        double rate = annualInterestRate / 100;
        double base = 1 + (rate / compoundFrequency);
        double exponent = compoundFrequency * timeInYears;
        return principal * Math.pow(base, exponent) - principal;
    }
}
