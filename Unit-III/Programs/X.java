class X {

    int a = 10;
    final int b = 20;

    public static void main(String[] args) {
        X x = new X();
        System.out.println("Value of a: " + x.a);
        System.out.println("Value of b: " + x.b);
        x.a = 30; // This is allowed because 'a' is not final
        x.b = 40; // This will cause a compile-time error because 'b' is final  
    }
}   










    

}