package Module1;

public class Test {

	static int i;
	final private int x = 20;
	
	

	public static void main(String[] args) {
		i = 100;
		Test t1 = new Test();
		t1.showx();
		showI();

	}
	

	private static void showI() {
		System.out.println(i);
		System.out.println();
	}


	void showx() {
		System.out.println(i);
		System.out.println();
	}
}