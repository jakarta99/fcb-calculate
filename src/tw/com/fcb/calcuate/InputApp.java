package tw.com.fcb.calcuate;

import java.util.Scanner;

public class InputApp {

	public static void main(String[] args) {
		
		int result = -1;
				
		while (result != 0) {
			System.out.println("Please input your number A :");
			Scanner scanner = new Scanner(System.in);
			
			int a = scanner.nextInt();
			
			System.out.println("Please input your number B :");
			scanner = new Scanner(System.in);
			
			int b = scanner.nextInt();
			
			CalculateService calculateService = new CalculateService();
			result = calculateService.sum(a, b);
	
			System.out.println(a+"+"+b+"="+result);
		}
		
	
		
	}

}
