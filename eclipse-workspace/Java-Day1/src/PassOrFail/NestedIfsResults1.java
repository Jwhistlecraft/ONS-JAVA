package PassOrFail;

public class NestedIfsResults1 {

	float Phy, Che, Mat;
	float Total, Per;

	public void calculations() {
		
		Total = Phy + Che + Mat;
		Per = Total * 100 / 450;
		
	}	
		
	public void showResults() {
	
		if(Phy*100/150>60) {
			if(Che*100/150>60) {
				if(Mat*100/150>60) {
					
					calculations();
					
					System.out.println("Marks Obtained:" + Total);
					System.out.println("Percentage:" + Per);
					
					if (Per >= 60 )
						System.out.println("Pass");
					else
						System.out.println("Fail");			
				}
			}
		}
		
		else
			System.out.println("fail");
	  	
	}

}
