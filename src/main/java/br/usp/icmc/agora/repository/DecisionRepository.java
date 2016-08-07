package br.usp.icmc.agora.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.usp.icmc.agora.domain.Decision;

@Repository
public interface DecisionRepository extends MongoRepository<Decision, String>{

}
