package br.edu.ifsp.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import br.edu.ifsp.dao.PessoaDAO;
import br.edu.ifsp.modelo.Pessoa;
import br.edu.ifsp.tela.TelaRemover;

public class TelaRemoverBuscarController implements ActionListener{

	private TelaRemover tela;
	
	public TelaRemoverBuscarController(TelaRemover telaRemover) {
		tela = telaRemover;
		tela.getBtnSearch().addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		ArrayList<Pessoa> pessoa = new ArrayList<>();
		pessoa.addAll(new PessoaDAO().listarPorNome(tela.getFldSearch().getText()));

		String[] split = pessoa.toString().split(" - ");
		tela.setId(split[0].replace("[", ""));

		tela.setNome(split[1]);

		String temp = split[2];
		String[] splitIdade = temp.split(" ");
		tela.setIdade(splitIdade[0]);

		temp  = split[3];
		String[] splitEndereco = temp.split(": ");
		tela.setEndereco(splitEndereco[1].replace("]", ""));

		tela.setLblName("Nome: " + tela.getNome());
		tela.setLblAge("Idade: " + tela.getIdade());
		tela.setLblAdress("Endereço: " + tela.getEndereco());
		
	}

}
