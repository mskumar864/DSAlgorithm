package Recursion;

public class fibanacciLoop {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		int n=2;
		int a=0;
		int b=1;
		int result=0;
		if(n<=1)
			result=n;
		
		for(int i=2;i<=n;i++) {
			
			
			result=a+b;
			a=b;
			b=result;
			
			
		}
		
		System.out.println("fibanacci number"+ result);

	}

}
