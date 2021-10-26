//Print reverse of array
public class ReverseArray{
	public static void main(String[]args) {
		int[]num = {1,2,3,4,5,6};
		int[] a = RevArray(num);
		for(int m = 0;m<a.length;m++) {
			System.out.println(a[m]+" ");
		}
		
		
	}

public static int[] RevArray(int[] ArrNum) {
	int j = ArrNum.length-1;
	
	for(int i=0;i<ArrNum.length/2;i++) {
		int temp = ArrNum[i];
		ArrNum[i] = ArrNum[j-i];
		ArrNum[j-i] = temp;
	}
	return ArrNum;
}
}