class Box {
    float width;
    float height;
    float depth;

    void volume() {
        float vol = width * height * depth;
        System.out.println("Volume is " + vol);
    }

    public static void main(String[] args) {
        Box x = new Box();
        Box y = new Box();
        x.depth = 20;
        x.width = 20;
        x.height = 20;
        y.width = 10;
        y.height = 10;
        y.depth = 10;
        x.volume();
        y.volume();
    }
}
