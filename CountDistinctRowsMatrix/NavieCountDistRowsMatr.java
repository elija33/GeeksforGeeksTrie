package CountDistinctRowsMatrix;

public class NavieCountDistRowsMatr {
    static int row = 4;
    static int col = 5;

    static void findUniqueRow(int M[][]) {
        for (int i = 0; i < row; i++) {
            int flag = 0;

            for (int j = 0; j < i; j++) {
                flag = 1;

                for (int k = 0; k < col; k++) {
                    if (M[i][k] != M[j][k])
                        flag = 0;

                    if (flag == 1) {
                        break;
                    }
                }
            }
            if (flag == 0) {
                for (int j = 0; j < col; j++) {
                    System.out.print(M[i][j] + " ");
                    System.out.println();
                }
            }
        }

    }

    public static void main(String[] args) {
        int M[][] = { { 0, 1, 0, 0, 1 },
                { 1, 0, 1, 1, 0 },
                { 0, 1, 0, 0, 1 },
                { 1, 0, 1, 0, 0 } };

        findUniqueRow(M);

        System.out.println();
    }
}
