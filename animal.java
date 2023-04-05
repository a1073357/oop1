import java.util.*;

public class animal {
    String name;
    String gender;
    String skill;
    double height;
    int weight;
    int speed;
    double dis;
    double x;
    double y;
    double z;

    static void showinfo() {
        System.out.println("歡迎進入冰雪奇緣系統");
    }

    void show() {
        System.out.printf("%-10s%-12.1f%-12d%-17d\n", name, height, weight, speed);
    }

    Scanner sc = new Scanner(System.in);

    public double distance(double x) {
        System.out.print("請輸入 " + this.name + " 這次跑步的時間(分鐘): ");
        x = sc.nextDouble();
        System.out.print("請輸入 " + this.name + " 這次跑步的加速度(輸入為0則默認為不輸入): ");
        y = sc.nextDouble();
        if (y != 0) {
            distance(x, y);
        } else {
            dis = this.speed * x;
            System.out.println("項目姓名  " + "身高(公尺)  " + "體重(公斤)  " + "性別  " + "冰凍技能  " + "速度(公尺/分鐘)  " + "跑步距離  ");
            System.out.printf("%-10s%-12.1f%-12d%-6s%-10s%-17d%-1.2f\n\n",
                    name, height, weight, gender, skill, speed, dis);
        }
        return dis;
    }

    public double distance(double x, double y) {
        dis = x * y * this.speed;
        System.out.println("項目姓名  " + "身高(公尺)  " + "體重(公斤)  " + "性別  " + "冰凍技能  " + "速度(公尺/分鐘)  " + "跑步距離  ");
        System.out.printf("%-10s%-12.1f%-12d%-6s%-10s%-17d%-1.2f\n\n",
                name, height, weight, gender, skill, speed, dis);
        return dis;
    }
}

class Olaf extends animal {
    @Override

    public void show() {
        this.name = "Olaf";
        this.height = 1.1;
        this.weight = 52;
        this.speed = 100;
        this.gender = "X";
        this.skill = "X";
        this.distance(x);

    }

}

class Sven extends animal {
    @Override
    public void show() {
        this.name = "Sven";
        this.height = 1.5;
        this.weight = 99;
        this.speed = 200;
        this.gender = "X";
        this.skill = "X";
        this.distance(x);
    }
}
