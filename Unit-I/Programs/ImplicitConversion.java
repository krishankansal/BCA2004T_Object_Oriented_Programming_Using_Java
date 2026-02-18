// Program 2: Implicit Type Conversion (Widening)
/*
👉 Teaches: Automatic conversion
Small type → Bigger type
*/

class ImplicitConversion {
    public static void main(String[] args) {
        int num = 100;
        double result = num; // automatic conversion

        System.out.println("Integer value: " + num);
        System.out.println("Converted to double: " + result);
    }
}
