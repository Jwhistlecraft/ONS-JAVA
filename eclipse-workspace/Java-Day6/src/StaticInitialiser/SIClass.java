package StaticInitialiser;

public class SIClass {

	static int a;
	int b;

	public SIClass() {
		b = 30;
	}

	public void dataChange(int x) {
		a = x;
	}

	static {
		System.out.println("calling static initializer");
		a = 15;
	}
	public static void msg() {
		System.out.println("hello my friend");
	}

}
