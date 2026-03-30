class Maruti extends Car {

    @Override
    void start() {
        System.out.println("Starting the car With button...");
    }

    void accelerate() {
        System.out.println("Accelerating the car...");
    }

    public static void main(String[] args) {
        Maruti m = new Maruti();
        m.changeGear();
        m.start();
        m.accelerate();
    }

}
