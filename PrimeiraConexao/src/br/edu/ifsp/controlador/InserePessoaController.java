package br.edu.ifsp.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import br.edu.ifsp.dao.PessoaDAO;
import br.edu.ifsp.modelo.Pessoa;
import br.edu.ifsp.tela.TelaPessoa;

public class InserePessoaController implements ActionListener {

	private TelaPessoa tela = null;
	private Pessoa modelo = null;
	
	public InserePessoaController(TelaPessoa telaPessoa) {
		
		tela = telaPessoa;
		modelo = new Pessoa();
		this.tela.getBotao().addActionListener(this);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		modelo.setNome(this.tela.getCampo1().getText());
		modelo.setIdade(Integer.parseInt(this.tela.getCampo2().getText()));
		modelo.setEndereco(this.tela.getCampo3().getText());
		
		// instacio o DAO Pessoa e insiro na base de dados
		new PessoaDAO().inserirPessoa(modelo);
		
		JOptionPane.showMessageDialog(null, "Pessoa inserida com sucesso!!");
		
		tela.dispose();
	}

}