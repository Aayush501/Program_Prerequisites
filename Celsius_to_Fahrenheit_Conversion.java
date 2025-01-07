import java.util.Scanner;

public class Celsius_to_Fahrenheit_Conversion{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		double f = (c*(9*1.0/5));
		System.out.println(f+32);
	}
}