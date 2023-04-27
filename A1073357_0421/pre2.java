package A1073357_0421;
/*請撰寫一個程式，讓使用者可以YYYY/MM/DD或是MM/DD/YYYY的格式輸入日期，並顯示使用者所輸入的年月日*/
import java.util.Scanner;

public class pre2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入日期(YYYY/MM/DD 或 MM/DD/YYYY):");

        String inputDate = sc.nextLine();

        if (inputDate.matches("\\d{4}/\\d{2}/\\d{2}") || inputDate.matches("\\d{2}/\\d{2}/\\d{4}")) {

            String[] parts = inputDate.split("/");

            int year;
            int month;
            int day;

            if (inputDate.matches("\\d{4}/\\d{2}/\\d{2}")) {
                year = Integer.parseInt(parts[0]);
                month = Integer.parseInt(parts[1]);
                day = Integer.parseInt(parts[2]);
            }

            else {
                year = Integer.parseInt(parts[2]);
                month = Integer.parseInt(parts[0]);
                day = Integer.parseInt(parts[1]);
            }

            if (year >= 1000 && year <= 9999) {

                if (month >= 1 && month <= 12) {

                    if (day >= 1 && day <= getDaysInMonth(year, month)) {
                        System.out.println("你輸入的日期: " + year + "/" + month + "/" + day);
                    } else {
                        System.out.println("日期輸入錯誤");
                    }
                } else {
                    System.out.println("月份輸入錯誤");
                }
            } else {
                System.out.println("年份輸入錯誤");
            }
        } else {
            System.out.println("輸入錯誤");
        }
    }

    public static int getDaysInMonth(int year, int month) {
        int daysInMonth;
        switch (month) {
            case 2:
                if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                    daysInMonth = 29;
                } else {
                    daysInMonth = 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = 30;
                break;
            default:
                daysInMonth = 31;
        }
        return daysInMonth;
    }
}
