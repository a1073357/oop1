import java.util.*;

public class human {
    String name;
    double height;
    int weight;
    String gender;
    String skill;
    int speed;
    double dis;
    double x;
    double y;
    double z;
    Scanner sc = new Scanner(System.in);

    void show() {
        System.out.printf("%-10s%-12.1f%-12d%-17d\n", name, height, weight, speed);
    }

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

class Kristoff extends human {
    @Override
    public void show() {
        this.name = "Kristoff";
        this.height = 1.9;
        this.weight = 80;
        this.gender = "男";
        this.skill = "X";
        this.speed = 150;
        this.distance(x);
    }
}

class Hans extends human {
    @Override

    public void show() {
        this.name = "Hans";
        this.height = 1.8;
        this.weight = 78;
        this.gender = "男";
        this.skill = "X";
        this.speed = 130;
        this.distance(x);
    }

}

class Anna extends human {
    @Override
    public void show() {
        this.name = "Anna";
        this.height = 1.7;
        this.weight = 48;
        this.gender = "女";
        this.skill = "X";
        this.speed = 120;
        this.distance(x);
    }
}

class Elsa extends human {
    @Override
    public void show() {
        this.name = "Elsa";
        this.height = 1.7;
        this.weight = 50;
        this.gender = "女";
        this.skill = "YES";
        this.speed = 120;
        this.distance(x);
    }
}