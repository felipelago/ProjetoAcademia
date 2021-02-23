package br.com.academia.service;

import java.util.List;

import br.com.academia.model.Pacote;

public interface PacoteService {

	/*
	 * Cadastra um novo Pacote
	 * 
	 * @param pacote, O pacote que será criado
	 * 
	 * @return O pacote que foi cadastrado
	 * 
	 * 
	 */
	public Pacote salvar(Pacote pacote);

	/*
	 * Deletar um Pacote
	 * 
	 * @param idPacote, O pacote que será deletado
	 * 
	 */
	public void deletar(Long idPacote);

	/*
	 * Listar os pacotes
	 * 
	 * @return a lista de pacotes.
	 * 
	 */
	public List<Pacote> listar();

	/*
	 * Listar por Pacote
	 * 
	 * @param nome os alunos serão listados
	 * 
	 * @return Lista de alunos por nome
	 * 
	 */
	public List<Pacote> listarPorNome(String nome);

	/*
	 * Editar um Pacote
	 * 
	 * @param pacote, O pacote que será editado
	 * 
	 * @return O pacote que foi editado
	 * 
	 */
	public Pacote editar(Pacote pacote);
}
