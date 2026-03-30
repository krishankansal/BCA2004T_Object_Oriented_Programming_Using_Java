/*
 * Program 1 — Method Overloading + Static Keyword
 * ------------------------------------------------
 * 
 * Problem Statement: Write a Java program for a Calculator class that
 * demonstrates method overloading by defining multiple add() methods accepting
 * different parameter types (two integers, three integers, and two doubles).
 * Also include a static counter variable that tracks how many times any add()
 * method is called, and a static method getCallCount() to return that count. In
 * main(), call each version of add() and display the results along with the
 * total call count.
 */

class Calculator1 {
    static int counter = 0;

    void add(int a, int b) {
        counter++;
        System.out.println("Sum of two integers called");
    }

    void add(int a, int b, int c) {
        counter++;
        System.out.println("Sum of three integers called");
    }

    void add(double a, double b) {
        counter++;
        System.out.println("Sum of two doubles called");
    }

    static int getCallCount() {
        return counter;
    }

    public static void main(String[] args) {
        Calculator1 calc = new Calculator1();
        calc.add(5, 10);
        calc.add(1, 2, 3);
        calc.add(2.5, 3.5);
        System.out.println("Total add() method calls: " + Calculator1.getCallCount());
    }

}