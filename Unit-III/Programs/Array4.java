// To print elements of a 2D array using for-each loop
class Array4 {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;
        for (int[] x : arr) {
            for (int i : x) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
