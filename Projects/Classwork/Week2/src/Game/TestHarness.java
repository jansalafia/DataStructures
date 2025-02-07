package Game;

public class TestHarness {

	
	public static void main(String [] args) {
		
		GameEntry ge1 = new GameEntry("sally", 100);
		GameEntry ge2 = new GameEntry("billy", 90);
		GameEntry ge3 = new GameEntry("eddie", 110);
		GameEntry ge4 = new GameEntry("winnie", 140);
		
		Scoreboard s = new Scoreboard(10);
		
		s.add(ge1);
		s.add(ge2);
		s.add(ge3);
 		s.add(ge4);

 		s.display();

		s.remove(2);
		System.out.println("--");
 		s.display();
		
	}
	
}
