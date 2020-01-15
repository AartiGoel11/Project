package test;

public class Fibonacci {

	public static void main(String[] args) {

		System.out.println("Sum of fibonacci series "+calculate(5));
	}

	private static int calculate(int n) {
	int sum;
		if(n<=0)
		return 0;
		
		int[] fibo = new int[n+1];
		fibo[0]=0;fibo[1]=1;
		sum=fibo[0]+fibo[1];
		
		for(int i=2;i<=n;i++)
		{
			fibo[i]=fibo[i-1]+fibo[i-2];
			sum+=fibo[i];
		}
		return sum;
		
	}

}
