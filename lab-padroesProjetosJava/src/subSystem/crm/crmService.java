package subSystem.crm;

public class crmService {
	
	private crmService() {
	}

	public static void saveClient(String name, String zipCode, String state, String city) {
		
		System.out.println(name);
		System.out.println(zipCode);
		System.out.println(city);
		System.out.println(state);

		System.out.println("\nClient saved in crm base!");		
	}
}
