package br.com.academia.resource;

import java.util.List;

import javax.websocket.server.PathParam;

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

import br.com.academia.model.Aluno;
import br.com.academia.service.AlunoService;

@RequestMapping("/alunos")
@RestController
public class AlunoResource {
	
	@Autowired
	AlunoService service;

	@PostMapping()
	@ResponseBody
	@ResponseStatus(code = HttpStatus.CREATED)
	public ResponseEntity<?> salvar(@RequestBody Aluno m) {
		return new ResponseEntity<Aluno>(this.service.salvar(m), HttpStatus.CREATED);
	}

	@GetMapping
	@ResponseBody
	@ResponseStatus(code = HttpStatus.OK)
	public ResponseEntity<?> listar() {
		return new ResponseEntity<List<Aluno>>(this.service.listar(), HttpStatus.OK);
	}

	@PutMapping
	@ResponseBody
	@ResponseStatus(code = HttpStatus.OK)
	public ResponseEntity<?> editar(@RequestBody Aluno m) {
		return new ResponseEntity<Aluno>(this.service.editar(m), HttpStatus.OK);
	}

	@DeleteMapping(value = "/{id}")
	@ResponseStatus(code = HttpStatus.OK)
	public void deletar(@PathVariable("Id") Long m) {
		this.service.deletar(m);
	}

}
