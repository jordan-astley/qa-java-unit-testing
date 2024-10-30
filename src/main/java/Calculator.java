
public class Calculator {

    public int add(int x, int y) {return x + y;}

    public int subtract(int x, int y) {return x - y;}

    public int multiply(int x, int y) {return x * y;}

    public double divide(double x, double y) {
        if (y != 0) {
            return x / y;
        } else {
            return Double.POSITIVE_INFINITY;
        }
    }

}
