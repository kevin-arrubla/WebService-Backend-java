package com.ecodeup.DAO;

import javax.persistence.EntityManager;

import com.ecodeup.model.JPAUtil;
import com.ecodeup.model.Movil;

public class MovilDao {
	
	EntityManager entity=JPAUtil.getEntityManagerFactory().createEntityManager();
	
	public void guardar(Movil movil) {
		
		entity.getTransaction().begin();
		entity.persist(movil);
		entity.getTransaction().commit();
	}
	
	public void eliminar(int idequipo) {
		Movil movil = new Movil();
		movil = entity.find(Movil.class, idequipo);
		entity.getTransaction().begin();
		entity.remove(movil);
		entity.getTransaction().commit();
	}

}
