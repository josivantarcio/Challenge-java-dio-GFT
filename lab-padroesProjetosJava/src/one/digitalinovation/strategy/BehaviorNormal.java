package one.digitalinovation.strategy;

public class BehaviorNormal implements Behavior{

	@Override
	public void move() {
		try {
			System.out.println("moving normally...");		
		}catch (Exception e) {
			System.err.println("Moving failed");
		}
	}

}
