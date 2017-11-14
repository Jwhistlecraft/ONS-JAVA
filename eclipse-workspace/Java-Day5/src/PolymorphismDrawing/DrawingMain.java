package PolymorphismDrawing;

public class DrawingMain {
	
	public static void main(String args[]) {
					
	DrawingParent D = new DrawingParent();
	LineChild L = new LineChild();
	CircleChild C = new CircleChild();
	
	letsDraw(D);
	letsDraw(L);
	letsDraw(C);
		
		
	}
	
	public static void letsDraw(DrawingParent X) {
		X.draw();
	}
}
