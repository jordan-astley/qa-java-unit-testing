
public class Main {

    public static void main(String args[]) {

        Calculator calc = new Calculator();

        System.out.println(calc.add(3,4));
        System.out.println(calc.divide(10,0));

        FizzBuzz fizz = new FizzBuzz();
        System.out.println(fizz.runFizzBuzz(5));
        System.out.println(fizz.runFizzBuzz(15));
        System.out.println(fizz.runFizzBuzz(3));
        System.out.println(fizz.runFizzBuzz(2));
    }
}
