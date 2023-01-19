package Utils;



public class Utils {


	
	public  static int getRandomNumber() {
		int min = 1;  
		int max = 10000;  
		//Generate random double value from 10 to 100   
		System.out.println("Random value of type double between "+min+" to "+max+ ":");  
		double a = Math.random()*(max-min+1)+min;   
		System.out.println(a);  
		//Generate random int value from 10 to 100
		System.out.println("Random value of type int between "+min+" to "+max+ ":");  
		int b = (int)(Math.random()*(max-min+1)+min);  
		System.out.println(b); 
		return b;
		}  
	
}
