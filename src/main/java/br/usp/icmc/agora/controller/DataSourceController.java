package br.usp.icmc.agora.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.usp.icmc.agora.domain.DataSource;
import br.usp.icmc.agora.service.DataSourceService;

@RestController
@RequestMapping("/dataSource")
public class DataSourceController {

	@Autowired
	private DataSourceService dsService;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public List<DataSource> list() {
		System.out.println("list!");
		System.out.println(dsService.listAll());
		return dsService.listAll();
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	@ResponseBody
	public void save(@RequestBody DataSource ds) {
		System.out.println("entrou-save!");
		if (StringUtils.hasText(ds.getId())) {
			System.out.println("update!");
			ds = dsService.update(ds);
			System.out.println(ds);
		} else {
			System.out.println("save!");
			ds = dsService.save(ds);
			System.out.println(ds);
		}
	}

	@RequestMapping(value = "/find", method = RequestMethod.POST)
	@ResponseBody
	public DataSource find(@RequestBody String id) {
		System.out.println("entrou-find!");
		return dsService.get(id);
	}

	@RequestMapping(value = "/delete", method = RequestMethod.DELETE)
	@ResponseBody
	public void delete(@RequestBody String id) {
		System.out.println("entrou-delete!");
		dsService.delete(id);
	}
}
