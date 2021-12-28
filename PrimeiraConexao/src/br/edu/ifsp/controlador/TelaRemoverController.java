package br.edu.ifsp.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import br.edu.ifsp.tela.TelaPrincipal;
import br.edu.ifsp.tela.TelaRemover;

public class TelaRemoverController implements ActionListener{

	private TelaPrincipal tela;
	
	public TelaRemoverController(TelaPrincipal telaPrincipal) {
		
		tela = telaPrincipal;
		tela.getBtnDelete().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		TelaRemover telaRemover = new TelaRemover();		
	}

}
