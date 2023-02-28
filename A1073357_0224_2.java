import java.util.*;

public class A1073357_0224_2{
public static void main(String[] argv){
	float Celsius,Fahrenheit;
	System.out.println("Please input a temperature value");
	Scanner myInput = new Scanner(System.in);
	Celsius = myInput.nextInt();
    Fahrenheit = Celsius*9/5+32;
	System.out.println("After the conversion, the temperature of Celsius is: " + Celsius + ", and the temperature of Fahrenheit is: " + Fahrenheit);
}
}