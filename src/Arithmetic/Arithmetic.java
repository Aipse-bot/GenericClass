package Arithmetic;

public class Arithmetic<N extends Number> {
    private final N num1;
    private final N num2;

    public Arithmetic(N n1, N n2) {
       this.num1 = n1;
       this.num2 = n2;

    }

    public double add() {return (Integer)num1 + (Integer)num2;
    }

    public double subtract() {
        return (Integer)num1 - (Integer)num2;
    }

    public double multiply() {
        return (Integer)num1 * (Integer)num2;
    }

    public double divide() {
        if ((Integer)num2 == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return (double) (Integer) num1 / (Integer) num2;
    }

    public Number getMin() {
        return Math.min((Integer)num1, (Integer)num2);
    }

    public Number getMax() {
        return Math.max((Integer)num1, (Integer)num2);
    }
}
