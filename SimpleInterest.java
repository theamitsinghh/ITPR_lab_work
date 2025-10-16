class SimpleInterestCalculator {
    // Method to calculate simple interest
    double calculateInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }
}

public class SimpleInterest {
    public static void main(String[] args) {
        // Create object of SimpleInterestCalculator
        SimpleInterestCalculator calculator = new SimpleInterestCalculator();

        // Example inputs
        double principal = 5000; // in rupees
        double rate = 5;         // annual interest rate in %
        double time = 2;         // in years

        // Call the method
        double interest = calculator.calculateInterest(principal, rate, time);

        // Display the result
        System.out.println("Principal: " + principal);
        System.out.println("Rate: " + rate + "%");
        System.out.println("Time: " + time + " years");
        System.out.println("Simple Interest: " + interest);
    }
}
