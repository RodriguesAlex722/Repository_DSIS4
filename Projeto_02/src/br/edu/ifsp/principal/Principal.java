package br.edu.ifsp.principal;

import br.edu.ifsp.Dao.ClienteDao;
import br.edu.ifsp.model.Cliente;

public class Principal {
	public static void main(String[] args) {
		Cliente c = new Cliente();
		c.setNome("Andreas Pereira Santos");
		c.setData_nasc("2000-11-15");
		
		ClienteDao dao = new ClienteDao();
		dao.salvarCliente(c);
	}

}
