package one.digitalinovation.strategy;

public class BehaviorAggressively implements Behavior{

	@Override
	public void move() {
		try {
			System.out.println("moving aggressively...");		
		}catch (Exception e) {
			System.err.println("Moving failed");
		}
	}

}
