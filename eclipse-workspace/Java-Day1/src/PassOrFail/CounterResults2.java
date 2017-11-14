package PassOrFail;

public class CounterResults2 {

	float Phy, Che, Mat;
	float Total, Per;

	public void calculations() {

		Total = Phy + Che + Mat;
		Per = Total / 450 * 100;

	}

	public void showResults() {

		int failCounter = 0;

		if (Phy / 150 * 100 <= 60) {
			failCounter++;
		}
		if (Che / 150 * 100 <= 60) {
			failCounter++;
		}
		if (Mat / 150 * 100 <= 60) {
			failCounter++;
		}

		if (failCounter == 0) {

			calculations();

			System.out.println("Marks Obtained:" + Total);
			System.out.println("Percentage:" + Per);
			System.out.println("0 Modules Failed, cudos!\n");

		} else if (failCounter == 1) {
			System.out.println("1 module failed, Retake the exam");
		} else if (failCounter == 2) {
			System.out.println("2 modules failed, Repeat the course");
		} else {
			System.out.println("3 modules failed, Please Go Home");
		}
	}
}
