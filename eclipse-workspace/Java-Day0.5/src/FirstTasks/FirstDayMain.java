package FirstTasks;

public class FirstDayMain {
	public static void main(String x[]){
		
		Hello.message();
		Count.counting();
		
		Baby baby1 = new Baby();
		baby1.name = "Jim";
		baby1.age = 1;
		baby1.weightInPounds = 15;
		baby1.speak();

	}
}
