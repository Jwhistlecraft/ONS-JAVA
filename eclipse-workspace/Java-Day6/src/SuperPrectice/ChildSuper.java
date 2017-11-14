package SuperPrectice;

public class ChildSuper extends ParentSuper{
	
	public ChildSuper() {
		super();
		System.out.println("child default constructor");
	}
	
	public ChildSuper(int a) {
		super(a);
		System.out.println("child constructor with one parameter");
	}
	
	public ChildSuper(int a, int b) {
		super(a,b);
		System.out.println("child constructor with two parameters");
		
		
	}			

}
