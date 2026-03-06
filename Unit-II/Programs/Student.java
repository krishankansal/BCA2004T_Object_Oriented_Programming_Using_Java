class Student {
    int rollNo;
    String name;

    // Default constructor
    Student() {
        rollNo = 101;
        name = "Rahul";
    }

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();
    }
}