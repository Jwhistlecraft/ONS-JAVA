package PassOrFail;

public class PassOrFailMain {
	public static void main(String args[]) {

		System.out.println("Printing results from task 1\n");

		NestedIfsResults1 Peter, James;

		Peter = new NestedIfsResults1();
		Peter.Phy = 120;
		Peter.Che = 120;
		Peter.Mat = 120;

		James = new NestedIfsResults1();
		James.Phy = 70;
		James.Che = 120;
		James.Mat = 120;

		Peter.showResults();
		James.showResults();

		System.out.println("\nFinished\n\n");

		System.out.println("Printing results from task 2\n");

		CounterResults2 Peter2, James2;

		Peter2 = new CounterResults2();
		Peter2.Phy = 120;
		Peter2.Che = 120;
		Peter2.Mat = 120;

		James2 = new CounterResults2();
		James2.Phy = 70;
		James2.Che = 120;
		James2.Mat = 120;

		Peter2.showResults();
		James2.showResults();

		System.out.println("\nFinished\n\n");

		System.out.println("Printing results from task 3\n");

		PrivateResults3 Peter3, James3;

		Peter3 = new PrivateResults3();
		Peter3.PhyCheck(1200);
		Peter3.CheCheck(1200);
		Peter3.MatCheck(2000);

		James3 = new PrivateResults3();
		James3.PhyCheck(120);
		James3.CheCheck(120);
		James3.MatCheck(120);

		Peter3.showResults();
		James3.showResults();

		System.out.println("Finished\n\n");

	}

}
