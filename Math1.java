class Calculator {
    //write functions for addition, substraction, multiplication, division, etc.
    
    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    int divide(int a, int b) {
        return a / b;
    }

    double divide(double a, double b) {
        return a / b;
    }

    int modulo(int a, int b) {
        return a % b;
    }
}

public class Math1 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(1, 2));
        System.out.println(calc.subtract(1, 2));
        System.out.println(calc.multiply(1, 2));
        System.out.println(calc.divide(1, 2));
        System.out.println(calc.divide(1.0, 2.0));
        System.out.println(calc.modulo(1, 2));
    }
}