package br.usp.icmc.agora.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.usp.icmc.agora.domain.InformationRequirement;
import br.usp.icmc.agora.service.InformationRequirementService;

@RestController
@RequestMapping("/informationRequirement")
public class InformationRequirementController {

	@Autowired
	private InformationRequirementService irService;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public List<InformationRequirement> list() {
		System.out.println("list!");
		System.out.println(irService.listAll());
		return irService.listAll();
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	@ResponseBody
	public void save(@RequestBody InformationRequirement ir) {
		System.out.println("entrou-save!");
		if (StringUtils.hasText(ir.getId())) {
			System.out.println("update!");
			ir = irService.update(ir);
			System.out.println(ir);
		} else {
			System.out.println("save!");
			ir = irService.save(ir);
			System.out.println(ir);
		}
	}

	@RequestMapping(value = "/find", method = RequestMethod.POST)
	@ResponseBody
	public InformationRequirement find(@RequestBody String id) {
		System.out.println("entrou-find!");
		return irService.get(id);
	}

	@RequestMapping(value = "/delete", method = RequestMethod.DELETE)
	@ResponseBody
	public void delete(@RequestBody String id) {
		System.out.println("entrou-delete!");
		irService.delete(id);
	}
}
