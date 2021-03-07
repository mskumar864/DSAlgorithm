package Recursion;

public class fibanacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("fibancci of number using tail recursion"+fibanacci(20));

	}
	public static int fibanacci(int n) {
		
		if(n<=1)
			return n;
		
		
		return fibanacci(n-1)+fibanacci(n-2);
		
		
	}
	
	

}
