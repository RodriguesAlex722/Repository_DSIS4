package br.edu.ifsp.tela;

import java.awt.Color;
import java.awt.Font;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import br.edu.ifsp.dao.PessoaDAO;

public class TelaLista extends JFrame {

	private JPanel pnl;

	private DefaultListModel<Object> dlm;
	private JList<Object> list;
	private JScrollPane scroll;

	private boolean busca = false;

	private String nome;

	public TelaLista() {
		createWindow();
		loadWindow();
	}

	public TelaLista(String nome) {
		busca = true;
		this.nome = nome;
		
		createWindow();
		loadWindow();
	}

	private void createWindow() {
		pnl = new JPanel();

		dlm = new DefaultListModel<>();

		if (!busca) {
			dlm.addAll(new PessoaDAO().listarTodasPessoas());
		} else {
			dlm.addAll(new PessoaDAO().listarPorNome(nome));
		}
		
		list = new JList<>(dlm);
		scroll = new JScrollPane(list);
		
		setContentPane(list);
		
		list.setBackground(new Color(210, 210, 210));
		list.setFont(new Font("Arial", 0, 14));
		
		addComponents();
	}

	private void addComponents() {
		pnl.add(scroll);

		add(pnl);
	}

	private void loadWindow() {
		setTitle("Listar pessoas");
		pack();
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}

}
