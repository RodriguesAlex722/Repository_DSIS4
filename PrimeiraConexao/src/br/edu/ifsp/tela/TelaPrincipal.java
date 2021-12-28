package br.edu.ifsp.tela;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import br.edu.ifsp.controlador.TelaBuscarPessoaController;
import br.edu.ifsp.controlador.TelaAtualizarController;
import br.edu.ifsp.controlador.TelaListaController;
import br.edu.ifsp.controlador.TelaPessoaController;
import br.edu.ifsp.controlador.TelaPrincipalFecharConexao;
import br.edu.ifsp.controlador.TelaRemoverController;

public class TelaPrincipal extends JFrame {

	private JPanel pnl;

	private JPanel pnlInfo;
	private JLabel lblInfo;

	private JPanel pnlButtons;
	private JButton btnAdd;
	private JButton btnList;
	private JButton btnFindName;
	private JButton btnAtu;
	private JButton btnDelete;

	public TelaPrincipal() {
		createWindow();
		loadWindow();
		
		TelaPessoaController addController = new TelaPessoaController(this);
		TelaListaController listaController = new TelaListaController(this);
		TelaBuscarPessoaController buscarController = new TelaBuscarPessoaController(this);
		TelaAtualizarController atualizarController = new TelaAtualizarController(this);
		TelaRemoverController removerController = new TelaRemoverController(this);
	
		TelaPrincipalFecharConexao window = new TelaPrincipalFecharConexao(this);
	}

	private void createWindow() {
		pnl = new JPanel(new GridLayout(2, 1));

		pnlInfo = new JPanel();
		lblInfo = new JLabel("Selecione a opção que deseja executar.");

		pnlButtons = new JPanel(new GridLayout(1, 5));
		btnAdd = new JButton("Adicionar");
		
		btnList = new JButton("Listar");
		
		btnFindName = new JButton("Pesquisar");

		btnEdit = new JButton("Atualizar");

		btnDelete = new JButton("Excluir");

		addComponents();
	}

	private void addComponents() {
		pnlInfo.add(lblInfo);

		pnlButtons.add(btnAdd);
		pnlButtons.add(btnList);
		pnlButtons.add(btnFindName);
		pnlButtons.add(btnAtu);
		pnlButtons.add(btnDelete);

		pnl.add(pnlInfo);
		pnl.add(pnlButtons);

		add(pnl);

	}

	private void loadWindow() {
		setTitle("Inicio");
		pack();
		setVisible(true);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
	}

	public JButton getBtnAdd() {
		return btnAdd;
	}

	public JButton getBtnList() {
		return btnList;
	}

	public JButton getBtnFindName() {
		return btnFindName;
	}

	public JButton getBtnAtu() {
		return btnEdit;
	}

	public JButton getBtnDelete() {
		return btnDelete;
	}
}
