package br.edu.ifsp.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import br.edu.ifsp.dao.PessoaDAO;
import br.edu.ifsp.modelo.Pessoa;
import br.edu.ifsp.tela.TelaAtualizar;

public class TelaAtualizarBuscaController implements ActionListener{

	private TelaAtualizar tela = null;
	
	public TelaAtualizarBuscaController(TelaAtualizar telaAtualizar) {
		tela = telaAtualizar;
		tela.getBtnSearch().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		ArrayList<Pessoa> pessoa = new ArrayList<>();
		pessoa.addAll(new PessoaDAO().listarPorNome(tela.getFldSearch().getText()));
						
		String [] split = pessoa.toString().split(" - ");
		tela.setId(split[0].replace("[", ""));
		
		String nome = split[1];
		
		String idade = split[2];
		String [] splitIdade = idade.split(" ");
		idade = splitIdade[0];
		
		String endereco = split[3];
		String [] splitEndereco = endereco.split(": ");
		endereco = splitEndereco[1].replace("]", "");
		
		tela.setFldName(nome);
		tela.setFldAge(idade);
		tela.setFldAdress(endereco);
	}
}
