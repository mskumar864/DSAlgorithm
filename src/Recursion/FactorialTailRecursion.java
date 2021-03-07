package Recursion;

public class FactorialTailRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	long n=20;
	long result=1;
		System.out.println("factorial of number using tail recursion"+factorial(n,result));

	}
	
	public static long factorial( long n, long result) {
		
		
		if(n==1)
			return result;
		
		
		return factorial(n-1,n*result);
	}

}
