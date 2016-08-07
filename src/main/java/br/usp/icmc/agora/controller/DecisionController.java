package br.usp.icmc.agora.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.usp.icmc.agora.domain.Decision;
import br.usp.icmc.agora.service.DecisionService;

@RestController
@RequestMapping("/decision")
public class DecisionController {

	@Autowired
	private DecisionService decisionService;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public List<Decision> list() {
		System.out.println("list!");
		System.out.println(decisionService.getDecisions());
		return decisionService.getDecisions();
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	@ResponseBody
	public void save(@RequestBody Decision decision) {
		System.out.println("entrou-save!");
		if (StringUtils.hasText(decision.getId())) {
			System.out.println("update!");
			decision = decisionService.update(decision);
			System.out.println(decision);
		} else {
			System.out.println("save!");
			decision = decisionService.save(decision);
			System.out.println(decision);
		}
	}
	
	@RequestMapping(value = "/find", method = RequestMethod.POST)
	@ResponseBody
	public Decision find(@RequestBody String id) {
		System.out.println("entrou-find!");
		return decisionService.getDecision(id);
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.DELETE)
	@ResponseBody
	public void delete(@RequestBody String id) {
		System.out.println("entrou-delete!");
		decisionService.delete(id);
	}
}
