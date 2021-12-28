package br.edu.ifsp.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import br.edu.ifsp.tela.TelaPessoa;
import br.edu.ifsp.tela.TelaPrincipal;

public class TelaPessoaController implements ActionListener {

	private TelaPrincipal tela = null;

	public TelaPessoaController(TelaPrincipal telaPrincipal) {

		tela = telaPrincipal;
		tela.getBtnAdd().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		TelaPessoa telaPessoa = new TelaPessoa("Formulario Pessoa");
		InserePessoaController controller = new InserePessoaController(telaPessoa);
	}

}
