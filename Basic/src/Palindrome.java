//Find the palindrome string and number
public class Palindrome {
	
	public static void main(String[]args) {
		Boolean a = isPalString("abcba");
		System.out.println(a);
		
		Boolean b = isPalNum(545);
		System.out.println(b);
	}
	

	public static boolean isPalString(String str) {
		int j = str.length()-1;
		
		for(int i=0;i<str.length()/2;i++) {
			if(str.charAt(i)!=(str.charAt(j-i))) {
				return false;
			}
				
		}
		
		return true;
		
	}
	
	private static Boolean isPalNum(int num) {
		int copyNum = num;
		int reversedNum = 0;
		int remainder;
		while(num>0) {
			remainder = num % 10;
			reversedNum = (reversedNum* 10)+remainder;
			num=num/10;
		}
		return copyNum==reversedNum;
	
}
}
