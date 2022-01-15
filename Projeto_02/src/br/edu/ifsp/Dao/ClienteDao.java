package br.edu.ifsp.Dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.RollbackException;
import javax.swing.JOptionPane;
import br.edu.ifsp.model.Cliente;

public class ClienteDao {

	private EntityManager getEntityManager() {
		EntityManagerFactory emf = null;
		EntityManager em = null;

		emf = Persistence.createEntityManagerFactory("clientePU");
		em = emf.createEntityManager();

		return em;
	}

	public Cliente salvarCliente(Cliente c) {
		EntityManager em = getEntityManager();

		try {
			em.getTransaction().begin();

			if (c.getId()==null){
				try {
					em.persist(c);
				} catch (PersistenceException de) {
					JOptionPane.showMessageDialog(null, "Ultrapassou limite de caracateres");
				c = null;
				}
			} else {
				em.merge(c);
			}
			try {
				em.getTransaction().commit();
			} catch (RollbackException rbe) {
				JOptionPane.showMessageDialog(null, "Ultrapassou limite de caracateres.");
				c = null;
			}
		} finally {
			em.close();
		}
		return c;
	}

	public void removeCliente(Integer id) {
		EntityManager em = getEntityManager();
		Cliente remove = em.find(Cliente.class, id);

		try {
			em.getTransaction().begin();
			em.remove(remove);
			em.getTransaction().commit();
		} finally {
			em.close();
		}
	}

	public Cliente fetchClienteById(Integer id) {
		EntityManager em = getEntityManager();
		Cliente recovery = null;

		try {
			recovery = em.find(Cliente.class, id);
			
		} catch (NullPointerException npe) {
			JOptionPane.showMessageDialog(null, "Cliente não localizado.");
		} finally {
			em.close();
		}

		return recovery;
	}

	public List<Cliente> fetchPersonByName() {
		EntityManager em = getEntityManager();

		List<Cliente> list = null;

		list = (List<Cliente>) em.createQuery("from Cliente").getResultList();

		return list;

	}

}
