import java.util.Scanner;
import java.lang.Math;

public class Calculate_Average_of_Three_Numbers{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		int second = sc.nextInt();
		int third = sc.nextInt();
		System.out.println(((first+second+third)*1.0)/3);
	}
}