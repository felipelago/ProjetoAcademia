package br.com.academia.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.academia.model.Pacote;
import br.com.academia.repository.PacoteRepository;

@Service // Para o SpringBoot entender que essa classe de serviço
@Transactional // Para transações de banco de dados

public class PacoteServiceImpl implements PacoteService {

	@Autowired
	PacoteRepository repository;

	public PacoteServiceImpl(PacoteRepository r) {
		this.repository = r;
	}

	@Override
	public Pacote salvar(Pacote pacote) {
		if (repository.existsByNome(pacote.getNome())) {
			System.out.println("Pacote já cadastrado");
			return null;
		} else {

			return repository.save(pacote);
		}
	}

	@Override
	public void deletar(Long idPacote) {
		repository.deleteById(idPacote);
		System.out.println("Pacote deletado com sucesso !");
	}

	@Override
	public List<Pacote> listar() {
		return repository.findAll();
	}

	@Override
	public List<Pacote> listarPorNome(String nome) {
		return repository.findByNome(nome);
	}

	@Override
	public Pacote editar(Pacote pacote) {
		return repository.save(pacote);
	}

}
