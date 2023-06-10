import java.io.*;

class Student implements Serializable{
    String Sname;
    private Grade grade;
    public Student(String Sname, Grade grade){
        this.Sname = Sname;
        this.grade = grade;
    }

    public String getSname(){
        return Sname;
    }

    public Grade getGrade(){
        return grade;
    }
}
class Grade implements Serializable{
    private short Escore;
    private short Mscore;
    private short Jscore;

    public Grade(short E, short M, short J){
        this.Escore = E;
        this.Mscore = M;
        this.Jscore = J;
    }
    public short getE(){return Escore;}
    public short getM(){return Mscore;}
    public short getJ(){return Jscore;}

    public double getAvg(){
        return (Escore + Mscore + Jscore)/3.0;
    }
}
public class A1073357_0526 {
    public static void main(String[] args) throws Exception {
        try{
        System.out.print("請輸入要建立的學生成績檔檔名"+"\n"+"->");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in,"Big5"));
        String fileName = br.readLine();
        PrintStream ps = new PrintStream(new FileOutputStream(fileName+".txt"));
        short count = 0;
        String str = new String();
        String title = "學生姓名\t英文成績 數學成績 Java成績 平均成績";
        ps.println(title+ "\n" + "-------------------------------------------------");
        do{
            count++;
            System.out.print("請輸入學生姓名：");
            String name = br.readLine();
            System.out.print("請輸入英文分數：");
            str = br.readLine();
            short E = Short.parseShort(str);
            System.out.print("請輸入數學分數：");
            str = br.readLine();
            short M = Short.parseShort(str);
            System.out.print("請輸入Java分數：");
            str = br.readLine();
            short J = Short.parseShort(str);

            Grade gg = new Grade(E, M, J);
            Student ss = new Student(name, gg);
            
            System.out.print("還要輸入另一筆學生成績嗎(y/n)?");
            str = br.readLine();
            ps.printf("%-11s%-9d%-8d%-10d%-9.2f\n",ss.getSname(),gg.getE(),gg.getM(),gg.getJ(),gg.getAvg());
            } while(str.equalsIgnoreCase("Y"));
            ps.flush();
            ps.close();
            System.out.println("\n已寫入" +count+" 筆學生資料至檔案"+ fileName + " 中。");
            
        }catch(IOException e){
            System.out.println("寫入檔案時出錯: " + e.getMessage());
        }

    }
}
