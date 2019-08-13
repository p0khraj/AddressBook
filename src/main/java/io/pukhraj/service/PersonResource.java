package io.pukhraj.service;
 
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.inject.Qualifier;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.process.internal.RequestScoped;
 
import io.pukhraj.model.Person;
import io.pukhraj.repo.PersonRepository; 

 
@RequestScoped
@Path(value = "/person")
@Consumes(MediaType.APPLICATION_JSON)
public class PersonResource {
	
	@Inject
	private PersonRepository personRepository;
	 
	 	
	@GET
	@Path(value="/id")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Person> getPersonById( @PathParam("id") int id ) throws ClassNotFoundException, SQLException{		
		 
		return personRepository.getPersonById(id);	
	
	}
	
	@POST
	@Path(value="/all")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public List<Map<String, Object>> getAllRecords() throws ClassNotFoundException, SQLException{		
		 
		return personRepository.getAllRecords();	
	
	}
	
	@PUT
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response updateRecord( Person person, @PathParam("id") int id ) throws ClassNotFoundException, SQLException{		
		 
		return personRepository.updateContact(person, id);	
	
	}
	
	@POST
	
 	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response storePerson( Person person) throws ClassNotFoundException, SQLException{		
		 
		return personRepository.createContact(person);
	
	}
	
	
}
