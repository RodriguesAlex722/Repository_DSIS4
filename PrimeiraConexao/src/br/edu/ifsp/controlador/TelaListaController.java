package br.edu.ifsp.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import br.edu.ifsp.tela.TelaLista;
import br.edu.ifsp.tela.TelaPrincipal;

public class TelaListaController implements ActionListener {

	private TelaPrincipal tela = null;

	public TelaListaController(TelaPrincipal telaPrincipal) {

		tela = telaPrincipal;
		tela.getBtnList().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		TelaLista telaLista = new TelaLista();
	}

}

