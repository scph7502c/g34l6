package first.project;

public class Calculator {
    public static void main(String[] args) {

        System.out.println(getDivide(8, 0));
    }

    static double getSum(double a, double b) {

        return Math.round((a + b) * 100.0) / 100.0;
    }
    static double getSubstraction(double a, double b) {

        return Math.round((a - b) * 100.0) / 100.0;
    }

    static double getMultiply(double a, double b) {

        return Math.round((a * b) * 100.0) / 100.0;
    }

    static double getDivide(double a, double b) {
        double divide = 0;
        if (b != 0) {
            divide = Math.round((a / b) * 100.0) / 100.0;
        } else System.out.println("You can't divide by 0!");
        return divide;
    }





}
