//Find min and max number from the array
public class MinMaxinArray {
	
	public static void main(String[]args) {
		int[] arr = {54,23,98,65,7};
		int a = max(arr);
		System.out.println(a);
		int b = min(arr);
		System.out.println(b);
	}
	
	public static int max(int[] arrNum) {
		int max = arrNum[0];
		for(int i=0;i<arrNum.length;i++) {
			if(max<arrNum[i]) {
				max = arrNum[i];
			}
		}
		
		return max;
		
	}
	
	public static int min(int[] arrNum1) {
		
		int min = arrNum1[0];
		for(int i=0;i<arrNum1.length;i++) {
			if(min>arrNum1[i]) {
				min = arrNum1[i];
			}
		}
		return min;
		
	}
}
