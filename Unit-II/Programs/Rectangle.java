class Rectangle {
    int width;
    int height;


    Rectangle(int w, int h) {
        this.width = w;

        this.height = h;
    }

    void area() {
        System.out.println("Area of rectangle: " + (width * height));
        System.out.println("Area of rectangle: " + (this.width * this.height));
        
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(50, 10);
        Rectangle r1 = new Rectangle(30, 40);
        r.area();
        r1.area();

    }
}
