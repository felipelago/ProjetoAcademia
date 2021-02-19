package br.com.academia.resource;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Index {
	@RequestMapping("/")
	private String index() {
		return "Hello World";
	}
}
