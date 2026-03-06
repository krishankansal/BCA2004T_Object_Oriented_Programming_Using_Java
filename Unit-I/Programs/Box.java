class Box {
    float width;
    float height;
    float depth;

    void volume() {
        float vol = this.width * this.height * this.depth;
        System.out.println("Volume is " + vol);
    }

    public static void main(String[] args) {
        Box x = new Box();
        Box y = new Box();

        x.width = 10;
        x.height = 10;
        x.depth = 10;
        y.depth = 20;
        y.height = 20;
        y.width = 20;
        x.volume();
        y.volume();

    }
}
