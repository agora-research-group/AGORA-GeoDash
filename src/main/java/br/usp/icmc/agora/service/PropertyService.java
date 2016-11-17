package br.usp.icmc.agora.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usp.icmc.agora.domain.Property;
import br.usp.icmc.agora.repository.PropertyRepository;

@Service
public class PropertyService {

	@Autowired
	private PropertyRepository pRepository;

	public List<Property> listAll() {
		return pRepository.findAll();
	}
	
	public List<Property> findByFeatureId(String featureId) {
		return pRepository.findByFeatureId(featureId);
	}


	public Property get(String id) {
		return pRepository.findOne(id);
	}

	public Property save(Property p) {
		return pRepository.save(p);
	}

	public Property update(Property p) {
		return pRepository.save(p);
	}

	public void delete(String id) {
		pRepository.delete(id);
	}
}