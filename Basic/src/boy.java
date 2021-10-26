
public class boy extends human {
	public void walk(){
	       System.out.println("Boy walks");
	   }
	   public static void main( String args[]) {
	       /* Reference is of Human type and object is
	        * Boy type
	        */
	       human obj = new boy();
	       /* Reference is of HUman type and object is
	        * of Human type.
	        */
	       human obj2 = new human();
	       obj.walk();
	       obj2.walk();
	   }
}
