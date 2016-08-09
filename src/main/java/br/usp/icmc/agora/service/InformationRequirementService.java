package br.usp.icmc.agora.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usp.icmc.agora.domain.InformationRequirement;
import br.usp.icmc.agora.repository.InformationRequirementRepository;

@Service
public class InformationRequirementService {

	@Autowired
	private InformationRequirementRepository irRepository;

	public List<InformationRequirement> listAll() {
		return irRepository.findAll();
	}

	public InformationRequirement get(String id) {
		return irRepository.findOne(id);
	}

	public InformationRequirement save(InformationRequirement ir) {
		return irRepository.save(ir);
	}

	public InformationRequirement update(InformationRequirement ir) {
		return irRepository.save(ir);
	}

	public void delete(String id) {
		irRepository.delete(id);
	}
}