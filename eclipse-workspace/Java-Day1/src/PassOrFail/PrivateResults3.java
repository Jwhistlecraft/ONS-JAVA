package PassOrFail;

public class PrivateResults3 {
	
	private float Phy, Che, Mat;
	private float Total, Per;
	
	public void PhyCheck(int A) {
		
		if (A >= 0 && A <=150) {
			Phy = A;
		}
		else {
			System.out.println("Not a valid number yo!");
		}
	}
	
	public void CheCheck(int B) {
		
		if (B >= 0 && B <=150) {
			Che = B;
		}
		else {
			System.out.println("Not a valid number yo!");
		}
	}
	
	public void MatCheck(int C) {
		
		if (C >= 0 && C <=150) {
			Mat = C;
		}
		else {
			System.out.println("Not a valid number yo!");
		}
	}
	

	public void calculations() {
		
		Total = Phy + Che + Mat;
		Per = Total / 450 * 100;
		
	}	
		
	public void showResults() {
	
		System.out.println(Phy+"..."+Che+"..."+Mat);
		if(Phy/150*100 >= 60) {
			if(Che/150*100 >= 60) {
				if(Mat/150*100 >= 60) {
					
					calculations();
					
					System.out.println("Marks Obtained:" + Total);
					System.out.println("Percentage:" + Per);
					System.out.println("Pass\n");
						
				}
			}
		}
		
		else
			System.out.println("fail\n");
	  	
	}

}


