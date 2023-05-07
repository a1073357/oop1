// 試寫一檢查的樂透對獎程式，程式中存有當期中獎號碼，使用者可輸入任一組六個整數(1~49)，程式即檢查是否中獎。
// 但當輸入1~49以外的數字時，則以例外的方式結束程式，並顯示相關訊息
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class A1073357_0505 {
    public static void main(String[] args) throws Exception {
    // int[] Wnum = RWnum();
    int[] Wnum = {3, 11, 18, 27, 35, 44};
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入六個整數(1~49)\n數字中間的區隔可以用空格鍵或enter鍵：");
        int[] Unum = new int[6];
        for (int i = 0; i < 6; i++) {
            int number = sc.nextInt();
            if (number < 1 || number > 49) {
                System.out.println("輸入錯誤！請輸入1~49之間的整數。");
                return;
            }
            Unum[i] = number;
        }
        Arrays.sort(Unum);
        System.out.println("您輸入的數字為：" + Arrays.toString(Unum));
        int Count = 0;
        for (int i = 0; i < 6; i++) {
            if (Arrays.binarySearch(Wnum, Unum[i]) >= 0) {
                Count++;
            }
        }
        System.out.println("中獎數字為：" + Arrays.toString(Wnum));
        if (Count == 6) {
            System.out.println("恭喜您中頭獎！");
        } else if (Count == 5) {
            System.out.println("恭喜您中貳獎！");
        } else if (Count == 4) {
            System.out.println("恭喜您中參獎！");
        } else if (Count == 3) {
            System.out.println("恭喜您中肆獎！");
        } else {
            System.out.println("很遺憾，您沒有中獎。");
        }
    }

    // private static int[] RWnum() {
    //     int[] Wnum = new int[6];
    //     Random random = new Random();
    //     for (int i = 0; i < 6; i++) {
    //         int number;
    //         do {
    //             number = random.nextInt(49) + 1;
    //         } while (Arrays.binarySearch(Wnum, number) >= 0);
    //         Wnum[i] = number;
    //     }
    //     Arrays.sort(Wnum);
    //     return Wnum;
    // }
}

