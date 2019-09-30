package com.ecodeup.DAO;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.ecodeup.model.JPAUtil;
import com.ecodeup.model.Persona;

public class PersonaDao {

EntityManager entity=JPAUtil.getEntityManagerFactory().createEntityManager();
	
	public void guardar(Persona persona) {
		
		entity.getTransaction().begin();
		entity.persist(persona);
		entity.getTransaction().commit();
		
		
	}
	
public List<Persona> obtenerPersonas(){
		
		List<Persona> listadoPersonas= new ArrayList<>();
		Query q=entity.createQuery("SELECT p FROM Persona p");
		listadoPersonas=q.getResultList();
		return listadoPersonas;
	}

public void eliminar(int id) {
	
	Persona miPersona = new Persona();
	miPersona=entity.find(Persona.class, id);
	
	entity.getTransaction().begin();
	entity.remove(miPersona);
	entity.getTransaction().commit();
}

public void actualizar(Persona persona) {
	entity.getTransaction().begin();
	entity.merge(persona);
	entity.getTransaction().commit();
}

public Persona buscar(int id) {
	Persona persona = new Persona();
	persona = entity.find(Persona.class, id);
	
	return persona;
}
}
