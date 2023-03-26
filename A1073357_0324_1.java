import java.util.*;

class Animal {
    String name;
    double height;
    int weight;
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
        System.out.print("請輸入 " + this.name + " 這次跑步的時間: ");
        x = sc.nextDouble();
        System.out.print("請輸入 " + this.name + " 這次跑步的加速度(如無須輸入即輸入0): ");
        y = sc.nextDouble();
        if (y != 0) {
            distance(x, y);
        } else {
            dis = this.speed * x;
            System.out.println("項目姓名  " + "身高(公尺)  " + "體重(公斤)  " + "速度(公尺/分鐘)  " + "跑步距離  ");
            System.out.printf("%-10s%-12.1f%-12d%-17d%-1.2f\n\n", name, height, weight, speed, dis);
        }
        return dis;
    }

    public double distance(double x, double y) {
        dis = x * y * this.speed;
        System.out.println("項目姓名  " + "身高(公尺)  " + "體重(公斤)  " + "速度(公尺/分鐘)  " + "跑步距離  ");
        System.out.printf("%-10s%-12.1f%-12d%-17d%-1.2f\n\n", name, height, weight, speed, dis);
        return dis;
    }
}

class Olaf extends Animal {
    @Override

    public void show() {
        this.name = "Olaf";
        this.height = 1.1;
        this.weight = 52;
        this.speed = 100;
        this.distance(x);
    }

}

class Kristoff extends Animal {
    @Override
    public void show() {
        this.name = "Kristoff";
        this.height = 1.5;
        this.weight = 99;
        this.speed = 200;
        this.distance(x);
    }
}

class Anna extends Animal {
    @Override
    public void show() {
        this.name = "Anna";
        this.height = 1.7;
        this.weight = 48;
        this.speed = 120;
        this.distance(x);
    }
}

class Elsa extends Animal {
    @Override
    public void show() {
        this.name = "Elsa";
        this.height = 1.7;
        this.weight = 50;
        this.speed = 120;
        this.distance(x);
    }
}

public class A1073357_0324_1 {

    public static void main(String[] args) {

        Animal olaf = new Olaf();
        Animal kristoff = new Kristoff();
        Animal anna = new Anna();
        Animal elsa = new Elsa();

        olaf.show();
        kristoff.show();
        anna.show();
        elsa.show();

    }

}