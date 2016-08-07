package br.usp.icmc.agora.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usp.icmc.agora.domain.Decision;
import br.usp.icmc.agora.repository.DecisionRepository;

@Service
public class DecisionService {

	@Autowired
	private DecisionRepository decisionRepository;

	public List<Decision> getDecisions() {
		return decisionRepository.findAll();
	}
	
	public Decision getDecision(String id) {
		return decisionRepository.findOne(id);
	}
	
	public Decision save(Decision decision) {
		return decisionRepository.save(decision);
	}
	
	public Decision update(Decision decision) {
		return decisionRepository.save(decision);
	}
	
	public void delete(String id) {
		decisionRepository.delete(id);
	}
}