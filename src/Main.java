public class Main {
    public static void main(String[] args) {
        // Sample user input as a string
        String userInput = "x^2 + 4";

        double a = 0.0; // Inferior limit
        double b = 1.0; // Superior limit
        int n = 20; // Number of intervals for approximation

        double result = Riemann.calculateRiemannSum(userInput, a, b, n);
        System.out.println("Approximated integral: " + result);
    }
}