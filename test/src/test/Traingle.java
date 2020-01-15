package test;

public class Traingle {

	public static void main(String[] args) {
	printStars(5);
	
	}

	private static void printStars(int n) {
 int i,j,num;
 int k=2*n-2;
  for(i=0;i<n;i++)
  { num=1;
	 for(j=0;j<k;j++)
	 {
		 System.out.print(" ");
	 }
	 k=k-2;
	  for(j=0;j<=i;j++)
	  {
		  System.out.print(num+" ");
		  num++;
	  }
	 
	  System.out.println();
  }
	}

}
