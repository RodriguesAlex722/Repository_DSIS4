package br.edu.ifsp.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import br.edu.ifsp.dao.PessoaDAO;
import br.edu.ifsp.modelo.Pessoa;
import br.edu.ifsp.tela.TelaRemover;

public class TelaRemoverFinalizarController implements ActionListener{

	private TelaRemover tela;

	public TelaRemoverFinalizarController(TelaRemover telaRemover) {
		tela = telaRemover;
		tela.getbtnEnd().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Pessoa pessoa = new Pessoa();
		
		pessoa.setId(Integer.parseInt(tela.getId()));
		pessoa.setNome(tela.getNome());
		pessoa.setIdade(Integer.parseInt(tela.getIdade()));
		pessoa.setEndereco(tela.getEndereco());

		new PessoaDAO().removerPessoa(pessoa);
		
		JOptionPane.showMessageDialog(null, tela.getFldSearch().getText() + " foi removido.");
		
		tela.dispose();
	}
	
}
