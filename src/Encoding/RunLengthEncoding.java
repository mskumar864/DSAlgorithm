package Encoding;

public class RunLengthEncoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Encoded String"+encode("aaabbcdsfddf"));

	}
	
	public static String encode(String str) {
		
		int count=0;
		char prev=0;
		
		char[] array=str.toCharArray();
		
		StringBuilder sb=new StringBuilder();
		
		for(char currchar:array) {
			
			if(currchar==prev)
				count++;
			else {
				if(prev!=0)
					sb.append(count).append(prev);
			
			prev=currchar;
			count=1;
			}
		}
		
		sb.append(count).append(prev);
		
		return sb.toString();
	}

}
