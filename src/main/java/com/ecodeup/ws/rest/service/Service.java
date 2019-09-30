package com.ecodeup.ws.rest.service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ecodeup.DAO.MovilDao;
import com.ecodeup.DAO.PersonaDao;
import com.ecodeup.model.Movil;
import com.ecodeup.model.Persona;

@Path("/PruebaArrubla")
public class Service {
	
	
	
	@GET
	@Path("/listadoPersona")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public  List<Persona> listadoLibros() {
		PersonaDao personaDao= new PersonaDao();

		return personaDao.obtenerPersonas();
	}
	
	
	@POST
	@Path("/registrarPersona")
	@Consumes("application/json; charset=UTF-8")
	@Produces("application/json; charset=UTF-8")
	public void registrarPersona(Persona persona) {
	PersonaDao personaDao= new PersonaDao();
	
	 personaDao.guardar(persona);
	}
	
	@DELETE
	@Path("/eliminarPersona/{id}")
	@Consumes("application/json; charset=UTF-8")
	@Produces("application/json; charset=UTF-8")
	public void eliminarPersona(@PathParam("id") int id) {
		PersonaDao personaDao = new PersonaDao();
		personaDao.eliminar(id);
	}
	
	@POST
	@Path("/registrarMovil")
	@Consumes("application/json; charset=UTF-8")
	@Produces("application/json; charset=UTF-8")
	public void registrarMovil(Movil movil) {
		MovilDao movilDao = new MovilDao();
		movilDao.guardar(movil);
	}
	
	
	
	
	
}
