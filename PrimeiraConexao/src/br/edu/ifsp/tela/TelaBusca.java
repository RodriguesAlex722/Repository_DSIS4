package br.edu.ifsp.tela;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.edu.ifsp.controlador.BotaoBuscarController;

public class TelaBusca extends JFrame{

	private JPanel pnl;
	private JLabel lbl;
	private JTextField fld;
	private JButton btn;
	
	public TelaBusca() {
		createWindow();
		loadWindow();
		
		BotaoBuscarController buscaController = new BotaoBuscarController(this);
	}
	
	private void createWindow() {
		pnl = new JPanel();
		
		lbl = new JLabel("Nome:");
		fld = new JTextField(20);
		
		btn = new JButton("Buscar");
		
		addComponents();
	}
	
	private void addComponents() {		
		pnl.add(lbl);
		pnl.add(fld);
		
		pnl.add(btn);
		
		add(pnl);
	}

	private void loadWindow() {
		setTitle("Buscar por nome");
		pack();
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}

	public JButton getBtn() {
		return btn;
	}

	public JTextField getFld() {
		return fld;
	}
}
