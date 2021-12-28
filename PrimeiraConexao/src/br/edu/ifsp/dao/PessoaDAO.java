package br.edu.ifsp.dao;

import br.edu.ifsp.conexao.Conexao;
import br.edu.ifsp.modelo.Pessoa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class PessoaDAO {

	Connection conexao = null;
	private int id = 0;
	private List<Pessoa> pessoas = new ArrayList<>();

	public PessoaDAO() {
		conexao = Conexao.obterConexao();
	}

	/**
	 * Este método é responsável por inserir o modelo na base de dados
	 */
	public void inserirPessoa(Pessoa pessoa) {

		String SQL_insert = "INSERT INTO pessoa(nome, idade, endereco) VALUE (?,?,?)";

		try {

			PreparedStatement pstm = conexao.prepareStatement(SQL_insert);

			pstm.setString(1, pessoa.getNome());
			pstm.setInt(2, pessoa.getIdade());
			pstm.setString(3, pessoa.getEndereco());

			pstm.executeUpdate();

		} catch (SQLException sqlex) {
			sqlex.printStackTrace();
			System.out.println("Erro ao executar SQL de insercao de Pessoa");
		}
	}

	/**
	 * Meétodo é responsavel por listar todos os registros na base de dados
	 * 
	 * @return
	 */
	public List<Pessoa> listarTodasPessoas() {
		String SQL_quarry = "SELECT * FROM pessoa";

		try {
			PreparedStatement pstm = conexao.prepareStatement(SQL_quarry);
			ResultSet rs = pstm.executeQuery();

			while (rs.next()) {
				Pessoa pessoa = new Pessoa();
				pessoa.setId(rs.getInt("id"));
				pessoa.setNome(rs.getString("nome"));
				pessoa.setIdade(rs.getInt("idade"));
				pessoa.setEndereco(rs.getString("endereco"));
				pessoas.add(pessoa);
			}

		} catch (SQLException sqlex) {
			sqlex.printStackTrace();
			System.out.println("Erro ao executar SQL ao buscar Pessoa");
		}

		return pessoas;
	}

	/**
	 * Método é responsável por atulizar os dados
	 */
	public void atualizarPessoa(Pessoa pessoa) {

		String SQL_update = "UPDATE pessoa SET nome = ?, idade = ?, endereco = ? WHERE id = ?";

		try {

			PreparedStatement pstm = conexao.prepareStatement(SQL_update);

			pstm.setString(1, pessoa.getNome());
			pstm.setInt(2, pessoa.getIdade());
			pstm.setString(3, pessoa.getEndereco());
			pstm.setInt(4, pessoa.getId());

			pstm.executeUpdate();

		} catch (SQLException sqlex) {
			sqlex.printStackTrace();
			System.out.println("Erro ao executar SQL ao editar Pessoa");
		}
	}

	/**
	 * Método é responsável por remover uma pessoa
	 */
	public void removerPessoa(Pessoa pessoa) {

		String SQL_delete = "DELETE FROM pessoa WHERE id = ?";

		try {

			PreparedStatement pstm = conexao.prepareStatement(SQL_delete);

			pstm.setInt(1, pessoa.getId());

			pstm.executeUpdate();

		} catch (SQLException sqlex) {
			sqlex.printStackTrace();
			System.out.println("Erro ao executar SQL ao excluir Pessoa");
		}
	}

	public void fecharConexao() {
		conexao = Conexao.fecharConexao();
	}
}
