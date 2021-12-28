package br.edu.ifsp.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import br.edu.ifsp.tela.TelaBusca;
import br.edu.ifsp.tela.TelaPrincipal;

public class TelaBuscarPessoaController implements ActionListener{

	private TelaPrincipal tela = null;
	
	public TelaBuscarPessoaController(TelaPrincipal telaPrincipal) {

		tela = telaPrincipal;
		tela.getBtnFindName().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		TelaBusca telaBusca = new TelaBusca();		
	}

}
