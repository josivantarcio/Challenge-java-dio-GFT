package labpadroesProjetosSpring.service;

import labpadroesProjetosSpring.model.Client;

/**
 * 
 * @author josivantarcio
 *
 */
public interface ClientService {
	
	
	/**
	 * CRUD all operations
	 */
	
	Iterable<Client> findAll();
	
	Client findID(Long id);
	
	void insert(Client client);
	
	void update(Long id, Client client);
	
	void delete(Long id);

	Client findId(Long id);

}
