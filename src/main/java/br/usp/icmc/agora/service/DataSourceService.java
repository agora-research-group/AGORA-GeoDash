package br.usp.icmc.agora.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usp.icmc.agora.domain.DataSource;
import br.usp.icmc.agora.repository.DataSourceRepository;

@Service
public class DataSourceService {

	@Autowired
	private DataSourceRepository dsRepository;

	public List<DataSource> listAll() {
		return dsRepository.findAll();
	}
	
	public DataSource get(String id) {
		return dsRepository.findOne(id);
	}
	
	public DataSource save(DataSource ds) {
		return dsRepository.save(ds);
	}
	
	public DataSource update(DataSource ds) {
		return dsRepository.save(ds);
	}
	
	public void delete(String id) {
		dsRepository.delete(id);
	}
}