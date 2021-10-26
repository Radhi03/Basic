
public class Swap {
	public static void main(String[]args) {
		int i = 15;
		int j = 10;
		
		i=i-j;
		j=i+j;
		i=j-i;
		
		System.out.println("i="+i+" j="+j);
	}
}
