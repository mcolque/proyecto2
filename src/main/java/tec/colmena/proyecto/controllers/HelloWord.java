package tec.colmena.proyecto.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloWord {

	@Autowired
	private RestTemplate clienteRest;
	
	@GetMapping("/welcome")
	public String welcome() {
		return "Bienvenido a Heroku :)";
	}
	
	@GetMapping("/sumar")
	public String sumar(@RequestParam float a, @RequestParam float b) {
		String resultado = Float.toString(a + b);
		return clienteRest.getForObject("https://resultadosproject.herokuapp.com/resultado/" + resultado, String.class);
	}
	
	@GetMapping("/restar")
	public String restar(@RequestParam float a, @RequestParam float b) {
		String resultado = Float.toString(a - b);
		return clienteRest.getForObject("https://resultadosproject.herokuapp.com/resultado/" + resultado, String.class);
	}
	
	
	@GetMapping("/sumareuropa")
	public String sumarEuropa(@RequestParam float a, @RequestParam float b) {
		String resultado = Float.toString(a + b);
		return clienteRest.getForObject("https://resultadoseuropamcolque.herokuapp.com/resultado/" + resultado , String.class);
	}
	@GetMapping("/restareuropa")
	public String restarEuropa(@RequestParam float a, @RequestParam float b) {
		String resultado = Float.toString(a - b);
		return clienteRest.getForObject("https://resultadoseuropamcolque.herokuapp.com/resultado/" + resultado , String.class);
	}
	
	
}
