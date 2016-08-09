package br.usp.icmc.agora.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.usp.icmc.agora.domain.InformationRequirement;

@Repository
public interface InformationRequirementRepository extends MongoRepository<InformationRequirement, String> {

}
