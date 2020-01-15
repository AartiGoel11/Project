package test;

public class Test {

	public static void main(String[] args) {
		
		try
		{
			int a =10/0;
			
		}
 catch(Exception e)
		{
	 System.out.println(e);
	 System.out.println("hello");
	 System.exit(1);
		}
	}

	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}
