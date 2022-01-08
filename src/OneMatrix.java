import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class OneMatrix {

    public static void main(String[] args) {
        int[][] A = new int[][]{
                {0, 1, 2, 3},
                {3, 1, 2, 4},
                {1, 0, 2, 3},
                {5, 9, 2, 5}
        };
        int[][] B = new int[0][0];

        int[][] x = oneMatrix(A);
        int[][] y = oneMatrix(B);
        int[][] z = oneMatrix(null);
        for (int[] ints : x) {
            System.out.println(Arrays.toString(ints));
        }
        for (int[] ints : y) {
            System.out.println(Arrays.toString(ints));
        }
        for (int[] ints : z) {
            System.out.println(Arrays.toString(ints));
        }
    }

    private static int[][] oneMatrix(int[][] A) {
        if (A == null) return new int[0][0];
        Set<Integer> rowIndexes = new HashSet<>();
        Set<Integer> colIndexes = new HashSet<>();
        int n = A.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (A[i][j] == 1) {
                    rowIndexes.add(i);
                    colIndexes.add(j);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (rowIndexes.contains(i) || colIndexes.contains(j)) {
                    A[i][j] = 1;
                }
            }
        }

        return A;
    }
}
