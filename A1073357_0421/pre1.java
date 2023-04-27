package A1073357_0421;
/*請撰寫一個程式，以使用規則表示法的檢查方式，
要求使用者輸入正確格式的電子郵件信箱(假設使用者名稱及網域中都只有小寫英文字母)*/
import java.util.*;
public class pre1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入電子郵件地址：");
        String email = sc.nextLine();

        String emailCheck = "^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,}$";

        if (email.matches(emailCheck)) {
            System.out.println("電子郵件地址格式正確！");
        } else {
            System.out.println("電子郵件地址格式不正確！");
        }
    }
}

