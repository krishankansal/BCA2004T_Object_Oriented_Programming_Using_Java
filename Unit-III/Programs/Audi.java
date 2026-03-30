class Audi extends Car {

    void changeGear() {
        System.out.println("Automatically Changing gear...");
    }

    void start() {
        System.out.println("Starting the car With button...");
    }

    public static void main(String[] args) {
        Audi a = new Audi();
        a.changeGear();
        a.start();
    }
}
