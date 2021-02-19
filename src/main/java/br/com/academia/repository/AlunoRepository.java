package br.com.academia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.academia.model.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {

	List<Aluno> findByNome(String nome);
	List<Aluno> findByNomeContains(String nome);
	boolean existsByCpf(String cpf);
}
