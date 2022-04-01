package tec.colmena.proyecto.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWord {

	
	@GetMapping("/welcome")
	public String welcome() {
		return "Bienvenido a Heroku";
	}
	
	
}
