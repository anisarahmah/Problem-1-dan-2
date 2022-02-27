import java.util.Random;

public class ComputeMethods5026211040 {
	
	//temperature
	public double fToC(double derajatF){
		return(5.0/9*(derajatF-32));
	}
	
	//hypotenuse
	public double hypotenuse(int a, int b){
		return(Math.sqrt((a*a)+(b*b)));
	}
	
	//roll dice
	public int roll() {
	    Random rndm = new Random();
		int dice1 = rndm.nextInt(6)+1;
		int dice2 = rndm.nextInt(6)+1;
	    return(dice1+dice2);
	}   
    
}

