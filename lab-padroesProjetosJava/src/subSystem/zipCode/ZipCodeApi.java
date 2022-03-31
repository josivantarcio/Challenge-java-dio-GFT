package subSystem.zipCode;

public class ZipCodeApi {

	private static ZipCodeApi instancia = new ZipCodeApi();

	private ZipCodeApi() {
		super();
	}

	public static ZipCodeApi getInstancia() {
				return instancia;
	}
	
	public String getCity(String zipCode) {
		return "Limoeiro do Norte :)";
	}
	
	public String getState(String zipCode) {
		return "Ceará - 'terra quente'!!!";
	}
}
