package StaticInitialiser;

public class SIMain {

	public static void main(String args[]) {

		SIClass.msg();
		SIClass.msg();
		
		//here we can see that the the method is called twice but the static initialiser is only called once.
	

	}

}
