package br.com.academia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.academia.model.Pacote;

@Repository
public interface PacoteRepository extends JpaRepository<Pacote, Long> {

	List<Pacote> findByNome(String nome);

	List<Pacote> findByNomeContains(String nome);

	boolean existsByNome(String nome);

}
