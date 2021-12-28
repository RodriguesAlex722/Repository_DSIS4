package br.edu.ifsp.controlador;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import br.edu.ifsp.dao.PessoaDAO;
import br.edu.ifsp.tela.TelaPrincipal;

public class TelaPrincipalFecharConexao implements WindowListener{

	private TelaPrincipal tela;
	
	public TelaPrincipalFecharConexao(TelaPrincipal telaPrincipal) {
		
		tela = telaPrincipal;
		tela.addWindowListener(this);
	}
	
	@Override
	public void windowClosing(WindowEvent e) {
		
		new PessoaDAO().fecharConexao();
		
		System.exit(0);
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
}
