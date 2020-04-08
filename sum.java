import java.util.*;

public class sum {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		int digit=0;
		while(number>0) {	
			
			digit=digit+(number%10);
			number=number/10;
			
		}
		
		System.out.println("The sum of the digits is: " + digit);
		
	}
}
