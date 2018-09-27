import java.util.Scanner;

public class Question1 {
	
	
	//static double TP;
	//the total price of the car
	//static double DP;
	//down payment
	//static int LL;
	//length of  loan
	//static double IR;
	//interest rate for loan
	
	//public Question1()	{
		Scanner stdin = new Scanner(System.in);
		
		
//		//String n = stdin.next();
//		//System.out.print(n);
//		System.out.print("What is the total price of the car?");
//		final double TP = stdin.nextDouble();
//		System.out.print("What is the down payment of the car?");
//		final double DP = stdin.nextDouble();
//		System.out.print("What is the length of the Loan?");
//		final double LL = stdin.nextInt();
//		System.out.print("What is the interest rate of the loan?");
//		final double IR = stdin.nextDouble();
	//}
	
	public static void main(String[] args)	{
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("What is the total price of the car?");
		final double TP = stdin.nextDouble();
		System.out.print("What is the down payment of the car?");
		final double DP = stdin.nextDouble();
		System.out.print("What is the length of the Loan?");
		final int LL = stdin.nextInt();
		System.out.print("What is the interest rate of the loan?");
		final double IR = stdin.nextDouble();
		stdin.close();
		System.out.print("Monthly Car Payment: " + monthlyCarPayment(TP, DP, LL, IR) + "\n" + "total Interest " + totalInterest(TP, DP, LL, IR));
	}
	
	public static double monthlyCarPayment(double TP, double DP, int LL, double IR)	{
		double mCP = ((Math.pow(1+IR/12, LL))*(TP-DP)*(IR/12))/(Math.pow(1+IR/12, LL)-1);
		return mCP;
	}
	
	public static double totalInterest(double TP, double DP, int LL, double IR)	{
		double newTP = TP - DP;
		double totInt = 0;
		for (int i = 1; i <= LL; i++) {
			newTP -= monthlyCarPayment(TP, DP,LL,IR)*(1-IR/12);
			totInt += monthlyCarPayment(TP, DP, LL, IR)-TP/LL;
		}
		return totInt;
		}
	}