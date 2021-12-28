package br.edu.ifsp.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import br.edu.ifsp.tela.TelaBusca;
import br.edu.ifsp.tela.TelaLista;

public class BotaoBuscarController implements ActionListener{

	private TelaBusca tela = null;
	
	public BotaoBuscarController(TelaBusca telaBusca) {
	
		tela = telaBusca;
		tela.getBtn().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		TelaLista telaLista = new TelaLista(tela.getFld().getText());
		
		tela.dispose();
	}

}
