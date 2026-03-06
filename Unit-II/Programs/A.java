class A {

    A() {
        System.out.println("Constructor called");
    }

    void hello() {
        System.out.println("Hello method called");
    }

    public static void main(String[] args) {
        A x = new A();
        A y = new A();
        A z = new A();
        A z1 = new A();
        A z2 = new A();
        x.hello();
    }
}
