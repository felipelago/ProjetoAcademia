package br.com.academia.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.academia.model.Pacote;
import br.com.academia.service.PacoteService;

@RequestMapping("/pacotes")
@RestController
public class PacoteResource {
	
	@Autowired
	PacoteService service;
	
	@PostMapping()
	@ResponseBody
	@ResponseStatus(code = HttpStatus.CREATED)
	public ResponseEntity<?> salvar(@RequestBody Pacote m) {
		return new ResponseEntity<Pacote>(this.service.salvar(m), HttpStatus.CREATED);
	}

	@GetMapping
	@ResponseBody
	@ResponseStatus(code = HttpStatus.OK)
	public ResponseEntity<?> listar() {
		return new ResponseEntity<List<Pacote>>(this.service.listar(), HttpStatus.OK);
	}

	@PutMapping
	@ResponseBody
	@ResponseStatus(code = HttpStatus.OK)
	public ResponseEntity<?> editar(@RequestBody Pacote m) {
		return new ResponseEntity<Pacote>(this.service.editar(m), HttpStatus.OK);
	}

	@DeleteMapping(value = "/{id}")
	@ResponseStatus(code = HttpStatus.OK)
	public void deletar(@PathVariable("id") Long m) {
		this.service.deletar(m);
	}

}
