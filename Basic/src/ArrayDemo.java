
public class ArrayDemo {
	static String s;

	public static void main(String args[]) {
		int[] data = new int[2];
		try {
			System.out.println(s.length());
			System.out.println(data[3]);
		} catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println("ArrayIndexOutOfBoundsException");
		} catch (NullPointerException e2) {
			System.out.println("NullPointerException");
		}
	}
}
