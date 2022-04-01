package labpadroesProjetosSpring.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import labpadroesProjetosSpring.model.Address;

@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface ViaZipCodeService {
	
	@RequestMapping(method = RequestMethod.GET, value = "/{cep}/json/" )
	Address consultZipCode(@PathVariable("cep") String cep);

}
