package one.digitalinovation.aplication;

import one.digitalinovation.strategy.Behavior;
import one.digitalinovation.strategy.BehaviorAggressively;
import one.digitalinovation.strategy.BehaviorNormal;
import one.digitalinovation.strategy.BehaviorPassively;
import one.digitalinovation.strategy.Bot;

public class TesteStrategy {
	public static void main(String[] args) {
		
		Behavior normal = new BehaviorNormal();
		Behavior aggres = new BehaviorAggressively();
		Behavior passiv = new BehaviorPassively();
		
		Bot bot = new Bot();
		bot.setBehavior(normal);
		bot.move();
		
		bot.setBehavior(aggres);
		bot.setBehavior(passiv);
		bot.move();
		
	}
}
