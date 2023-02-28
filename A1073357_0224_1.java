import java.util.*;

public class A1073357_0224_1{
public static void main(String[] argv){
	int num;
	System.out.println("Please input an integer");
	Scanner myInput = new Scanner(System.in);
	num = myInput.nextInt();
    if(num%2 == 0){
	System.out.println("Your input is an even number : "+num);
    }
    else{
	System.out.println("Your input is an odd number: "+num);
    }
}
}