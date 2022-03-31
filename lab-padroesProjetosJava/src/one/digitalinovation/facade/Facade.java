package one.digitalinovation.facade;

import subSystem.crm.crmService;
import subSystem.zipCode.ZipCodeApi;

/**
 * PT - Imagine que voce tem uma base de cliente e deseja migrar os cliente para base nova...
 * EN - Imagine you have a customer base and want to migrate the customers to a new base...
 * 
 * @author josivantarcio
 *
 */

public class Facade {
	
	public void migrateClient(String name, String zipCode) {
		
		String city = ZipCodeApi.getInstancia().getCity(zipCode);
		String state = ZipCodeApi.getInstancia().getState(zipCode);
				
		
		crmService.saveClient(name, zipCode, city, state);
	}

}
