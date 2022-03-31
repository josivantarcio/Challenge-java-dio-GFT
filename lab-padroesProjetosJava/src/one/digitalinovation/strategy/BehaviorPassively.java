package one.digitalinovation.strategy;

public class BehaviorPassively implements Behavior{

	@Override
	public void move() {
		try {
			System.out.println("moving passively...");		
		}catch (Exception e) {
			System.err.println("Moving failed");
		}
	}

}
