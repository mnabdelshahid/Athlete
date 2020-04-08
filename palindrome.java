import java.util.*;


public class palindrome {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String given;
		System.out.println("Please put in a string");
		given=sc.nextLine().toLowerCase();
		int flag=0;
		
		int len=given.length();
		int i;
		for(i=0;i<len/2;i++) {
			if(given.charAt(i)==given.charAt(len-1-i)) {
				continue;
			}
			else 
				
				flag=1;
				break;
		
		}
		if(flag==1)
			System.out.println("False");
		else
			System.out.println("True");
		
	}
}
