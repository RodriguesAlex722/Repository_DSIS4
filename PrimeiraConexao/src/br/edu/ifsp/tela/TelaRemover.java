package br.edu.ifsp.tela;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.edu.ifsp.controlador.TelaRemoverBuscarController;
import br.edu.ifsp.controlador.TelaRemoverFinalizarController;

public class TelaRemover extends JFrame {

	private JPanel pnl;

	private JPanel pnlSearch;
	private JLabel lblSearch;
	private JTextField fldSearch;
	private JButton btnSearch;

	private JPanel pnlEdit;
	private JLabel lblName;
	private JLabel lblAge;
	private JLabel lblAdress;

	private JPanel pnlButton;
	private JButton btnEnd;

	private String id;
	private String nome;
	private String idade;
	private String endereco;

	public TelaRemover() {
		createWindow();
		loadWindow();
		
		TelaRemoverBuscarController removeController = new TelaRemoverBuscarController(this);
		TelaRemoverFinalizarController finalizaController = new TelaRemoverFinalizarController(this);
	}

	private void createWindow() {
		pnl = new JPanel(new GridLayout(3, 1));

		pnlSearch = new JPanel();
		lblSearch = new JLabel("Nome");
		fldSearch = new JTextField(20);
		btnSearch = new JButton("Buscar");

		pnlEdit = new JPanel(new GridLayout(3, 1, 10, 10));
		lblName = new JLabel("Nome: ");
		lblAge = new JLabel("Idade: ");
		lblAdress = new JLabel("Endereço: ");

		pnlButton = new JPanel();
		btnEnd = new JButton("Remover");

		addComponents();
	}

	private void addComponents() {
		pnlSearch.add(lblSearch);
		pnlSearch.add(fldSearch);
		pnlSearch.add(btnSearch);

		pnlEdit.add(lblName);
		pnlEdit.add(lblAge);
		pnlEdit.add(lblAdress);

		pnlButton.add(btnEnd);

		pnl.add(pnlSearch);
		pnl.add(pnlEdit);
		pnl.add(pnlButton);

		add(pnl);
	}

	private void loadWindow() {
		setTitle("Remover pessoa");
		pack();
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public JTextField getFldSearch() {
		return fldSearch;
	}

	public JButton getBtnSearch() {
		return btnSearch;
	}

	public JButton getbtnEnd() {
		return btnEnd;
	}

	public void setLblName(String name) {
		this.lblName.setText(name);
	}

	public void setLblAge(String age) {
		this.lblAge.setText(age);
	}

	public void setLblAdress(String adress) {
		this.lblAdress.setText(adress);
	}

}
