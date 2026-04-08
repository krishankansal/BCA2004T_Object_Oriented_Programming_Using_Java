// To print elements of a 3D array using for-each loop
class Array5 {
    public static void main(String[] args) {
        int[][][] arr = { { { 1, 2, 3 }, { 4, 5, 6 } },
                { { 7, 8, 9 }, { 10, 11, 12 } }
        };
        for (int[][] x : arr) {
            for (int[] y : x) {
                for (int i : y) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
