import java.util.*;

public class cex {
		public static void main(String args[]) {
			Scanner sc=new Scanner(System.in);
			double weight;
			int runTime;
			int sleepTime;
			int soccerTime;
			int swimTime;
			System.out.println("Please input the weight of the person in pounds");
			weight=(sc.nextDouble())/2.2;
			//System.out.println(weight);
			System.out.println("Please input the time in minutes the person runs");
			runTime=sc.nextInt();
			System.out.println("Please input the time in minutes the person sleeps");
			sleepTime=sc.nextInt();
			System.out.println("Please input the time in minutes the person plays soccer");
			soccerTime=sc.nextInt();
			System.out.println("Please input the time in minutes the person swims");
			swimTime=sc.nextInt();
			int runCEX=12;
			int soccerCEX=10;
			int sleepCEX=1;
			int swimCEX=14;
			double totalRunCal=0.0175*(runTime*runCEX)*weight;
			double totalSoccerCal=0.0175*(soccerTime*soccerCEX)*weight;
			double totalSleepCal=0.0175*(sleepTime*sleepCEX)*weight;
			double totalSwimCal=0.0175*(swimTime*swimCEX)*weight;
			double totalCal= totalRunCal+ totalSoccerCal + totalSleepCal + totalSwimCal;
			
			System.out.println("Calories required for running are: " + totalRunCal);
			System.out.println("Calories required for playing soccer are: " + totalSoccerCal);
			System.out.println("Calories required for sleeping are: " + totalSleepCal);
			System.out.println("Calories required for swimming are: " + totalSwimCal);
			System.out.println("Total calories required are: " + totalCal);
			
			
			
		}
}



