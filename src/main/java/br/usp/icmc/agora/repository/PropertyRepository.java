package br.usp.icmc.agora.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.usp.icmc.agora.domain.Property;

@Repository
public interface PropertyRepository extends MongoRepository<Property, String>{

	List<Property> findByFeatureId(String featureId);
	
}
