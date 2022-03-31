package one.digitalinovation.singleton;

/**
 * Singleton "Apressado",
 * @autor josivantarcio
 */
public class SingletonEager {

	private static SingletonEager instancia = new SingletonEager();

	private SingletonEager() {
		super();
	}

	public static SingletonEager getInstancia() {
				return instancia;
	}

	
	
	
}
