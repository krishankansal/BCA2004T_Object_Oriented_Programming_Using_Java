// Program 4: Overflow Example
/*
👉 Teaches: Range limit
    Overflow behavior
*/
class OverflowExample {
    public static void main(String[] args) {
        byte num = 127;
        num++; // exceeds range

        System.out.println("After overflow: " + num);
    }
}
