import java.util.Scanner;

public class Calculate_Simple_Interest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int principal = sc.nextInt();
		int rate = sc.nextInt();
		int time = sc.nextInt();
		System.out.println((1.0*principal*rate*time)/100.0);
	}
}