package br.usp.icmc.agora.controller;

import br.usp.icmc.agora.domain.HelloWorld;
import br.usp.icmc.agora.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/hello")
@CrossOrigin
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/world")
    @ResponseBody
    public HelloWorld helloWorld() {
        HelloWorld helloWorld = helloService.getEntity();
        helloWorld.setText("Hello World");

        return helloWorld;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/world")
    public void post(HelloWorld helloWorld) {
        helloService.save(helloWorld);
    }
}
