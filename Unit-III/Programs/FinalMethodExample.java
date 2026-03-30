class FinalMethodExample1 {
    void display() {
        System.out.println("This is a final method.");
    }

    final void show() {
        System.out.println("This is a non-final method.");
    }
}

class FinalMethodExample extends FinalMethodExample1 {

    void display() {
        System.out.println("Trying to override a final method.");
    }

    void show() {
        System.out.println("Overriding a non-final method.");
    }
}
