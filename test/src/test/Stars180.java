package test;

public class Stars180 {

	public static void main(String[] args) {
		printStars(5);

	}

	private static void printStars(int n) {

		int i,j,k= 2*n-2;
		for(i=0;i<n;i++)
		{
			for(j=0;j<k;j++)
			{
				System.out.print(" ");
			}
			k=k-2;
			for(j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
