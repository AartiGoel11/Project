package test;

public class Stars {

	public static void main(String[] args) {
   printStars(5);
	}

	private static void printStars(int n) {

	
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
