package labpadroesProjetosSpring.service.implem;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import labpadroesProjetosSpring.model.Address;
import labpadroesProjetosSpring.model.AddressRepository;
import labpadroesProjetosSpring.model.Client;
import labpadroesProjetosSpring.model.ClientRepository;
import labpadroesProjetosSpring.service.ClientService;
import labpadroesProjetosSpring.service.ViaZipCodeService;



@Service
public class ClientServiceImplement implements ClientService {

	@Autowired
	private ClientRepository clientRepository;
	@Autowired
	private AddressRepository addressRepository;
	@Autowired
	private ViaZipCodeService viaZipCodeService;

	@Override
	public Iterable<Client> findAll() {
		return clientRepository.findAll();
	}

	@Override
	public Client findID(Long id) {
		Optional<Client> client = clientRepository.findById(id);
		return client.get();
	}

	@Override
	public void insert(Client client) {
		saveClientZipCode(client);
	}

	@Override
	public void update(Long id, Client client) {
		Optional<Client> clientBd = clientRepository.findById(id);
		if (clientBd.isPresent()) {
			saveClientZipCode(client);
		}
	}

	@Override
	public void delete(Long id) {
		clientRepository.deleteById(id);
	}

	private void saveClientZipCode(Client client) {
	
		String cep = client.getAddress();
		Address address = addressRepository.findById(cep).orElseGet(() -> {
			
			Address newAddress = ViaZipCodeService.findZipCode(cep);
			AddressRepository.save(newAddress);
			return novoEndereco;
		});
		client.setAddress(cep);
		
		clientRepository.save(client);
	}

}