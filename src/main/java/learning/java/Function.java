package learning.java;

public class Function {
    // Функція y = x^2 - 4x + 3
    public static double f(double x) {
        return x * x - 4 * x + 3;
    }

    // Похідна функції y' = 2x - 4
    public static double df(double x) {
        return 2 * x - 4;
    }

    // Знаходження екстремуму (x, y)
    public static double[] findExtremum() {
        double xExtremum = 4.0 / 2.0; // Розв'язок рівняння 2x - 4 = 0
        double yExtremum = f(xExtremum);
        return new double[]{xExtremum, yExtremum};
    }
}
