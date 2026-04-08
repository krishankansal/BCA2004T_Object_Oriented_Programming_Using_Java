class B {
    public static void main(String[] args) {
        String s = "Java Programming";
        System.out.println(s.charAt(1));
        System.out.println(s.length());
        for (char c : s.toCharArray()) {
            System.out.print(c + " ");
        }
        System.out.println();
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i) + " ");
        }
    }
}
