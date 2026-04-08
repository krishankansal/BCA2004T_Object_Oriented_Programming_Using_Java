class D {
    public static void main(String[] args) {
        String s = "Java Programming";
        System.out.println(s);
        char c = s.charAt(0);
        System.out.println(c);
        System.out.println(s.length());
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i) + " ");
        }
    }
}