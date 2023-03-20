import java.util.Scanner;

public class A1073357_0317_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("請輸入第一個數字：");
        int m = sc.nextInt();
        System.out.print("請輸入第二個數字：");
        int n = sc.nextInt();

        int[][] table = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        System.out.println("以下為輸出結果：");

        for (int[] row : table) {
            for (int num : row) {
                System.out.print(num + ",");
            }
            System.out.println();
        }

        // int[][] table = new int[m + 1][n];
        // for (int i = 1; i < table.length; i++) {
        // for (int j = 1; j <= table[i].length; j++) {
        // int k = i * j;
        // System.out.print(k + ",");
        // // System.out.print(i + "*" + j + "=" + i * j + "\t");
        // }
        // System.out.println();
        // }

    }
}
