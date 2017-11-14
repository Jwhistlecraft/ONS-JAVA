package StringMaipulation4;

public class main2 {
	public static void main(String args[]) {

		StringFinder test = new StringFinder();
		test.finder("i", "i");
		test.finder("hello my scala friend", "scala");
		test.finder("wubbalubbadubbdubb", "b");
		test.finder("hello my friend", "hello");
		test.finder("M", "Manchester");
					
	}
}
