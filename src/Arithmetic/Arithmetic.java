package Arithmetic;

public class Arithmetic {
    private final int num1;
    private final int num2;

    public Arithmetic(int n1, int n2) {
       this.num1 = n1;
       this.num2 = n2;

    }

    public double add() {
        return num1 + num2;
    }

    public double subtract() {
        return num1 - num2;
    }

    public double multiply() {
        return num1 * num2;
    }

    public double divide() {
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return (float)num1 / (float)num2;
    }

    public Number getMin() {
        return Math.min(num1, num2);
    }

    public Number getMax() {
        return Math.max(num1, num2);
    }
}
