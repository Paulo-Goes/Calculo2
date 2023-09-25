import de.congrace.exp4j.Calculable;
import de.congrace.exp4j.ExpressionBuilder;

public class Riemann {

    public static double calculateRiemannSum(String expression, double a, double b, int n) {
        double delta_x = (b - a) / n; // Width of each subinterval
        double sum = 0.0;

        try {
            Calculable calc = new ExpressionBuilder(expression)
                    .withVariable("x", 0.0) // You can use any initial value for the variable
                    .build();

            for (int i = 0; i < n; i++) {
                double x_i = a + i * delta_x; // Left endpoint of subinterval
                double x_i_plus_1 = a + (i + 1) * delta_x; // Right endpoint of subinterval

                // Bind the current value of 'x' to the expression
                calc.setVariable("x", (x_i + x_i_plus_1) / 2);

                double aux = calc.calculate() * delta_x;
                // Evaluate the expression and add it to the sum
                sum += aux;

                System.out.println("Subinterval " + (i + 1) + ": " + aux);

            }
        } catch (Exception e) {
            System.err.println("Invalid expression: " + expression);
        }
        return sum;
    }
}