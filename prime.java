
import java.util.*;

public class prime {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input the number");
		
		int i,j,n,flag;
		n=sc.nextInt();
		
		for(i=2;i<n;i++) {
			flag=0;
			for(j=2;j<=i/2;j++) {
				if(i==2)
					System.out.println("2");
				else if(i==3)
					System.out.println("3");
				
				
				else if(i%j==0) {
					flag=1;
					break;
				}
				else
					continue;
			}
			if(flag==0)
				System.out.println(i);
		}
		
		
	}
}
