// Program 3: Explicit Type Conversion (Narrowing)
/*
👉 Teaches: Casting syntax
    Data loss (99.99 → 99)
*/

class ExplicitConversion {
    public static void main(String[] args) {
        double num = 99.99;
        int result = (int) num; // manual conversion

        System.out.println("Double value: " + num);
        System.out.println("Converted to int: " + result);
    }
}
