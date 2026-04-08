// Program to convert int to Integer using valueOf() method
// This technique is called Boxing in Java, 
// where a primitive type is converted to its corresponding wrapper class
//  object.
class A{
    public static void main(String[] args) {
        int x = 10;
        Integer i = Integer.valueOf(x);
        System.out.println(i);
    }
}