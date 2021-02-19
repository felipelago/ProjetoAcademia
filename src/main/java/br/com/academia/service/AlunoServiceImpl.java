package br.com.academia.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.academia.model.Aluno;
import br.com.academia.repository.AlunoRepository;

@Service // Para o SpringBoot entender que essa classe de serviço
@Transactional // Para transações de banco de dados
public class AlunoServiceImpl implements AlunoService {

	@Autowired
	AlunoRepository repository;

	public AlunoServiceImpl(AlunoRepository r) {
		this.repository = r;
	}

	@Override
	public Aluno salvar(Aluno aluno) {
		if (repository.existsByCpf(aluno.getCpf())) {
			System.out.println("CPF existente");
			return null;
		} else {

			return repository.save(aluno);
		}
	}

	@Override
	public void deletar(Long idAluno) {
		repository.deleteById(idAluno);
		System.out.println("Aluno deletado com sucesso !");

	}

	@Override
	public List<Aluno> listar() {
		return repository.findAll();
		
	}

	@Override
	public List<Aluno> listarPorNome(String nome) {
		return repository.findByNomeContains(nome);
	}

	@Override
	public Aluno editar(Aluno aluno) {
		return repository.save(aluno);
	}

}
