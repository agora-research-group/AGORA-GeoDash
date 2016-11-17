package br.usp.icmc.agora.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.usp.icmc.agora.domain.Property;
import br.usp.icmc.agora.service.PropertyService;

@RestController
@RequestMapping("/property")
public class PropertyController {

	@Autowired
	private PropertyService pService;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public List<Property> list() {
		System.out.println("list!");
		System.out.println(pService.listAll());
		return pService.listAll();
	}

	@RequestMapping(value = "/findByFeatureId", method = RequestMethod.POST)
	@ResponseBody
	public List<Property> listPerFeatureId(@RequestBody String featureId) {
		System.out.println("list!");
		System.out.println(pService.findByFeatureId(featureId));
		return pService.findByFeatureId(featureId);
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	@ResponseBody
	public void save(@RequestBody Property p) {
		System.out.println("entrou-save!");
		if (StringUtils.hasText(p.getId())) {
			System.out.println("update!");
			p = pService.update(p);
			System.out.println(p);
		} else {
			System.out.println("save!");
			p = pService.save(p);
			System.out.println(p);
		}
	}

	@RequestMapping(value = "/find", method = RequestMethod.POST)
	@ResponseBody
	public Property find(@RequestBody String id) {
		System.out.println("entrou-find!");
		return pService.get(id);
	}

	@RequestMapping(value = "/delete", method = RequestMethod.DELETE)
	@ResponseBody
	public void delete(@RequestBody String id) {
		System.out.println("entrou-delete!");
		pService.delete(id);
	}
}
