//Print reverse of String
public class ReverseString {

	public static void main(String[] args) {
		String a = "beautiful";
		char t[] = a.toCharArray();
		for (int i = t.length - 1; i >= 0; i--) {
			System.out.print(t[i]);
		
		}
		System.out.println("   ");
		String value1 =	reverseStr("landscape");
		System.out.println(value1);
	}
	
	public static String reverseStr(String str) {
	    // create variable to store reversed version of str
	    StringBuilder reverse = new StringBuilder();

	    // iterate over input string from the back with charAt
	    for(int i = str.length() - 1; i >= 0; i--) {
	      // add chars to reversed variable
	      reverse.append(String.valueOf(str.charAt(i)));
	    }

	    // convert to string and return reversed version 
	    return reverse.toString();
	   
	    
	  }

}
