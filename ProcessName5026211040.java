import java.util.Scanner;

public class ProcessName5026211040{
    public static void main(String[] args) {	
	Scanner scn = new Scanner(System.in);
		
		System.out.print("Type your full name : " );
		String name = scn.nextLine();
		
		int idx1 = name.indexOf(' ');
		
		String firstN = name.substring(0,idx1);
		String LastN = name.substring(idx1);
			
		System.out.println("Your Name is " +LastN+", "+firstN);
	}
}