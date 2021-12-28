package br.edu.ifsp.tela;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.edu.ifsp.controlador.TelaAtualizarBuscaController;
import br.edu.ifsp.controlador.TelaAtualizarSalvarController;

public class TelaEditar extends JFrame{

	private JPanel pnl;
	
	private JPanel pnlSearch;
	private JLabel lblSearch;
	private JTextField fldSearch;
	private JButton btnSearch;
	
	private JPanel pnlEdit;
	private JPanel pnlName;
	private JLabel lblName;
	private JTextField fldName;
	private JPanel pnlAge;
	private JLabel lblAge;
	private JTextField fldAge;
	private JPanel pnlAdress;
	private JLabel lblAdress;
	private JTextField fldAdress;
	
	private JPanel pnlButton;
	private JButton btnSave;

	private String id;

	public TelaAtualizar() {
		createWindow();
		loadWindow();
		
		TelaAtualizarSalvarController salvarController = new TelaAtualizarSalvarController(this);
		TelaAtualizarBuscaController buscarController = new TelaAtualizarBuscaController(this);
	}
	
	private void createWindow() {
		pnl = new JPanel(new GridLayout(3, 1));
		
		pnlSearch = new JPanel();
		lblSearch =new JLabel("Nome");
		fldSearch = new JTextField(20);
		btnSearch = new JButton("Buscar");
				
		pnlEdit = new JPanel(new GridLayout(3, 2));
		pnlName = new JPanel();
		lblName = new JLabel("Nome");
		fldName = new JTextField(20);
		pnlAge = new JPanel();
		lblAge = new JLabel("Idade");
		fldAge = new JTextField(20);
		pnlAdress = new JPanel();
		lblAdress = new JLabel("Endereço");
		fldAdress = new JTextField(20);
		
		pnlButton = new JPanel();
		btnSave = new JButton("Salvar");
		
		addComponents();
	}
	
	private void addComponents() {		
		pnlSearch.add(lblSearch);
		pnlSearch.add(fldSearch);
		pnlSearch.add(btnSearch);
		
		pnlName.add(lblName);
		pnlName.add(fldName);
		
		
		pnlAge.add(lblAge);
		pnlAge.add(fldAge);
		
		pnlAdress.add(lblAdress);
		pnlAdress.add(fldAdress);
		
		pnlEdit.add(pnlName);
		pnlEdit.add(pnlAge);
		pnlEdit.add(pnlAdress);
		
		pnlButton.add(btnSave);

		pnl.add(pnlSearch);
		pnl.add(pnlEdit);
		pnl.add(pnlButton);
		
		add(pnl);
	}

	private void loadWindow() {
		setTitle("Atualizar pessoa");
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
	
	public JTextField getFldName() {
		return fldName;
	}

	public void setFldName(String name) {
		this.fldName.setText(name);
	}

	public JTextField getFldAge() {
		return fldAge;
	}

	public void setFldAge(String age) {
		this.fldAge.setText(age);
	}

	public JTextField getFldAdress() {
		return fldAdress;
	}

	public void setFldAdress(String adress) {
		this.fldAdress.setText(adress);
	}

	public JTextField getFldSearch() {
		return fldSearch;
	}

	public JButton getBtnSearch() {
		return btnSearch;
	}

	public JButton getBtnSave() {
		return btnSave;
	}
}
