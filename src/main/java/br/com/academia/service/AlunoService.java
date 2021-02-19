package br.com.academia.service;

import java.util.List;

import br.com.academia.model.Aluno;

public interface AlunoService {

	/*
	 * Cadastra um novo Aluno
	 * 
	 * @param aluno, O aluno que será criado
	 * 
	 * @return O aluno que foi cadastrado
	 * 
	 * @throws Se existir um aluno com o mesmo CPF retorna uma mensagem de erro
	 * 
	 */
	public Aluno salvar(Aluno aluno);

	/*
	 * Deletar um aluno
	 * 
	 * @param idAluno, O aluno que será deletado
	 * 
	 */
	public void deletar(Long idAluno);

	/*
	 * Listar os alunos
	 * 
	 * @return a lista de alunos.
	 * 
	 */
	public List<Aluno> listar();
	
	/*
	 * Listar por nome
	 * 
	 * @param nome os alunos serão listados
	 * 
	 * @return Lista de alunos por nome
	 * 
	 */
	public List<Aluno> listarPorNome(String nome);
	
	/*
	 * Editar um Aluno
	 * 
	 * @param aluno, O aluno que será editado
	 * 
	 * @return O aluno que foi editado
	 * 
	 */
	public Aluno editar(Aluno aluno);
	
}
