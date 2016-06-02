package br.usp.icmc.agora.repository;

import org.springframework.stereotype.Repository;

import br.usp.icmc.agora.utils.Common;

@Repository
public class SosRepository {

	public String request(String json) {
		
		return Common.httpPost(json, "application/json");
	}
}