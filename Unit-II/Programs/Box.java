class Box {

    double width;
    double height;
    double depth;

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    void volume() {
        System.out.print("Volume is ");
        System.out.println(this.width * this.height * this.depth);
    }

    public static void main(String[] args) {
        Box x = new Box(10, 10, 10);
        Box y = new Box(20, 20, 20);

        x.volume();
        y.volume();
    }

}
