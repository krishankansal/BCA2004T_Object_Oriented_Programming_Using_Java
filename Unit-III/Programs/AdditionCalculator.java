class AdditionCalculator extends Calculator {

    int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public static void main(String[] args) {
        AdditionCalculator addCalc = new AdditionCalculator();
        System.out.println(addCalc.add(2, 3)); // Output: 5
        System.out.println(addCalc.add(1, 2, 3)); // Output: 6
        System.out.println(addCalc.add(2.5, 3.5)); // Output: 6.0
        System.out.println(addCalc.add(1, 2, 3, 4)); // Output: 10
    }
}
