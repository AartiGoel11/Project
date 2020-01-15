package test;

public class SumOfDigits {

	public static void main(String[] args) {

		int result=sumOfDigits(123456);
		System.out.println("Sum = "+result);
	}

	private static int sumOfDigits(int i) {
if(i==0)
		return 0;
else
	return (i%10+sumOfDigits(i/10));
	}

}
