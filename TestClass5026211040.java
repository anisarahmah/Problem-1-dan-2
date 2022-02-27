import java.util.Scanner;
public class TestClass5026211040 {
    public static void main(String[] args) {
	ComputeMethods5026211040 comp = new ComputeMethods5026211040();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Temperatur (dalam Fahrenheit) : ");
		double tempF = sc.nextDouble();
		
		System.out.print("Input a : ");
		int a = sc.nextInt();
		System.out.print("Input b : ");
		int b = sc.nextInt();

		System.out.println("Temp in celcius is : "+comp.fToC(tempF));	//temperature
		System.out.println("Hypotenuse is : "+comp.hypotenuse(a,b));	//hypotenuse
		System.out.println("The sum of the dice is : "+comp.roll());  	//roll dice
    }
}
