class FinalVaraiableExample {
    int a = 10;
    final int b = 20;

    public static void main(String[] args) {
        FinalVaraiableExample obj = new FinalVaraiableExample();
        System.out.println(obj.a);
        System.out.println(obj.b);
        obj.a = 30; // This is allowed
        System.out.println(obj.a);
        //obj.b = 40; // This will cause a compile-time error because b is final
    }

}
