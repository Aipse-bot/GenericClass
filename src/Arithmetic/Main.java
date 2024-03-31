package Arithmetic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter number #1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter number #2: ");
        int n2 = sc.nextInt();

        Arithmetic<Integer> arithmetic = new Arithmetic<>(n1, n2);
        MyMap<Object, Object> map = new MyMap<>();

        System.out.println("Sum: " + arithmetic.add());
        System.out.printf("Difference: %.3f%n", arithmetic.subtract());
        System.out.printf("Product: %.3f%n", arithmetic.multiply());

        try {
            System.out.printf("Product: %.3f%n", arithmetic.divide());
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Minimum: " + arithmetic.getMin());
        System.out.println("Maximum: " + arithmetic.getMax());



        map.put("Name", "Paul");
        map.put("Age", 25);
        map.put("Name", "Kent");
        System.out.println("Name: " + map.get("Name"));
        System.out.println("Age: " + map.get("Age"));
        System.out.println("Removed: " + map.remove("gone"));
        System.out.println("Removed Age: " + map.remove("Age"));
    }
}
