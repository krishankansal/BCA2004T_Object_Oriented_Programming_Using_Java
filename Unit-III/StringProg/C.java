class C {

    public static void main(String[] args) {
        String s = "Java Programming";
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.startsWith("Java"));
        System.out.println(s.endsWith("Programming"));
        System.out.println(s.contains("Prog"));

        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println(s1.equals(s2));

        String s3 = "hello";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s3));
    }

}
