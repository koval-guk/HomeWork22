package calc;

public class Calc {

    public static int random(int from, int to) {
        return (int) ((Math.random() * (to - from)) + to);
    }

    public static double add(double x, double y) {
        return x + y;
    }

    public static double subtract(double x, double y) {
        return x - y;
    }

    public static double multiply(double x, double y) {
        return x * y;
    }

    public static double divide(double x, double y) {
        if (y != 0) {
            return x / y;
        } else {
            throw new ArithmeticException();
        }
    }
}
