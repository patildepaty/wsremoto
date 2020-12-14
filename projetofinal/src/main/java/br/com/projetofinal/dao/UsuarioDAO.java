package br.com.projetofinal.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.projetofinal.beans.Usuario;

/*
 * DAO => Data Access Object
 */

public interface UsuarioDAO extends CrudRepository<Usuario, Integer> {
	
/*
 * save() => gravar ou alterar um registro/linha da tabela
 * findById() => pesquisar pela chave primária
 * findAll() => pesquisar todos
 * deleteAll() => apaga todas as linhas da tabela
 */

	public Usuario findByEmailAndSenha(String email, String senha);
	
	
}
