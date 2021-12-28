package br.edu.ifsp.tela;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaPessoa extends JFrame {
	
	// Labels
	JLabel texto1 = null;
	JLabel texto2 = null;
	JLabel texto3 = null;
	
	// Campo texto
	JTextField campo1 = null;
	JTextField campo2 = null;
	JTextField campo3 = null;
	
	// Botao
	JButton botao = null;
		
	public TelaPessoa(String titulo) {
		super(titulo);
		inicializaComponentes();
	}
	
	public void inicializaComponentes() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500,300, 325, 200);
		
		texto1 = new JLabel("Nome: ");
		texto2 = new JLabel("Idade: ");
		texto3 = new JLabel("Endereco: ");
		
		campo1 = new JTextField(20);
		campo2 = new JTextField(20);
		campo3 = new JTextField(20);
		
		botao = new JButton("Salvar");
		
		JPanel panel = new JPanel();
		panel.add(texto1);
		panel.add(campo1);
		panel.add(texto2);
		panel.add(campo2);
		panel.add(texto3);
		panel.add(campo3);
		panel.add(botao);
		
		getContentPane().add(panel);
		setVisible(true);
	}

	public JTextField getCampo1() {
		return campo1;
	}

	public void setCampo1(JTextField campo1) {
		this.campo1 = campo1;
	}

	public JTextField getCampo2() {
		return campo2;
	}

	public void setCampo2(JTextField campo2) {
		this.campo2 = campo2;
	}

	public JTextField getCampo3() {
		return campo3;
	}

	public void setCampo3(JTextField campo3) {
		this.campo3 = campo3;
	}

	public JButton getBotao() {
		return botao;
	}

	public void setBotao(JButton botao) {
		this.botao = botao;
	}
}
