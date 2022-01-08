package br.edu.ifsp.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.ifsp.model.Cliente;

public class Principal {
	
	private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("BancoPU");
	private static EntityManager entityManager = entityManagerFactory.createEntityManager();

	public static void main(String[] args) {
	
		// FIND
		Cliente cliente = entityManager.find(Cliente.class, 1);
		System.out.println("Nome do cliente:" + cliente.getNome());
		
		// INSERT
//		Cliente cliente = new Cliente();
//		cliente.setNome("ALEX");
//		
//		entityManager.getTransaction().begin();
//		entityManager.persist(cliente);
//		entityManager.getTransaction().commit();
		
		// DELETE
//		Cliente cliente = entityManager.find(Cliente.class, 2);
//		entityManager.getTransaction().begin();
//		entityManager.remove(cliente);
//		entityManager.getTransaction().commit();
		
		// MODIFY
//		Cliente cliente = new Cliente();
//		cliente.setId(1);
//		cliente.setNome("Michel");
		
//		entityManager.getTransaction().begin();
//		entityManager.merge(cliente);
//		entityManager.getTransaction().commit();

		entityManager.close();
		entityManagerFactory.close();
		
	}
	
}

