package Recursion;

public class TowersOfHannoiRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=2;
		char src='A',middle='B',dest='C';

		towersofHannoi(n,src,middle,dest);
		
	}
	
	public static void towersofHannoi(int n, char src, char middle, char dest) {
		
		
		//base class
		if(n==0) {
			System.out.println("plate"+ n +" from "+ src +" to"+ dest);
			
			return; 
		}
		
		
		// Move n-1 disk to middle
		towersofHannoi(n-1,src,dest,middle);
		
		//Move n disk high
		System.out.println("plate"+ n +" from "+ src +" to"+dest);
		
		
		//Move n-1 disk to high
		
		towersofHannoi(n-1,middle,src,dest);
		
		
		
	}

}
