
public class honda extends Bike {
	void run() {
	System.out.println("running at 100kmph");
	super.run();
	}

	public static void main(String[] args) {
		honda ho = new honda();
		ho.run();
		
	}

}
