package br.edu.ifsp.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import br.edu.ifsp.tela.TelaAtualizar;
import br.edu.ifsp.tela.TelaPrincipal;

public class TelaAtualizarController implements ActionListener{

private TelaPrincipal tela = null;
	
	public TelaAtualizarController(TelaPrincipal telaPrincipal) {
		
		tela = telaPrincipal;
		tela.getBtnAtu().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		TelaAtualizar telaAtualizar = new TelaAtualizar();
	}
	
}
