package Recursion;

public class fibanaccitail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("fibancci of number using tail recursion"+fibanacci(6,0,1));

	}
	public static int fibanacci(int n,int a, int b) {
		
		if(n==0)
			return a;
		if(n==1)
			return b;
		
		
		return fibanacci(n-1,b,a+b);
		
		
	}
	
	

}


//0 1 1 2 3 5 8