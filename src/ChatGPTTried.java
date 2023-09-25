public class ChatGPTTried {
    // Define the function you want to integrate
    public static double function(double x) {
        return x * x + 4;
    }

    public static double riemannSum(double a, double b, int n) {
        double delta_x = (b - a) / n;
        double sum = 0.0;

        for (int i = 0; i < n; i++) {
            double x_i = a + i * delta_x;
            sum += function(x_i) * delta_x;
        }

        return sum;
    }

    public static void main(String[] args) {
        double a = 0.0;  // Lower limit of the interval
        double b = 1.0;  // Upper limit of the interval
        int n = 2;    // Number of rectangles

        double result = riemannSum(a, b, n);
        System.out.println("Approximate integral: " + result);
    }
}