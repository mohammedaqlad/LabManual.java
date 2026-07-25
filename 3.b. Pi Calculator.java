import java.util.Scanner;
public class PiCalculator {
    private int numberOfTerms;
    private double computedPi;
    public static final double EXACT_PI = Math.PI;
    public PiCalculator(int terms) {
        this.numberOfTerms = terms;
        this.computedPi = calculateLeibnizPi();
    }
    double calculateLeibnizPi() {
        double pi = 0.0;
        double dm = 1.0;
        int sign = 1;
        for (int i = 0; i < numberOfTerms; i++) {
            pi += sign * (4.0 / dm);
            dm += 2.0;
            sign *= -1;
        }
        return pi;
    }
    public double getPiValue() {
        return this.computedPi;
    protected void displayPrecisionInfo() {
        System.out.println("Precision used: " + numberOfTerms + " terms");
        System.out.println("Series used: Leibniz Series (4/1 - 4/3 + 4/5 - 4/7 + 4/9 ...)");
    }
    public void displayPrivateDataInternal() {
        System.out.println("Raw computed value (private): " + this.computedPi);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Pi Calculator using Access Specifiers ===");
        System.out.print("Enter the number of terms for Pi approximation: ");
        int terms = sc.nextInt();
        System.out.println("Calculating Pi using Leibniz Series...");
        PiCalculator calculator = new PiCalculator(terms);
        System.out.println("\nPublic Method - Displaying Result:");
        System.out.println("Approximated value of Pi: " + calculator.getPiValue());
        System.out.println("\nProtected Method - Displaying Precision Info:");
        calculator.displayPrecisionInfo();
        System.out.println("\nPrivate Data - Accessed only within class:");
        calculator.displayPrivateDataInternal();
        sc.close();
    }
}
