package io.pukhraj.repo;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.inject.Inject;
import javax.ws.rs.core.Response;

import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.core.statement.Query;
import org.sqlite.SQLiteDataSource;

import io.pukhraj.config.DbConfig;
import io.pukhraj.model.Person;


public class PersonRepositoryImpl implements PersonRepository {

	public void findPersonById(Long id) {
		
		
		// TODO Auto-generated method stub
	 
	}

	public Response createContact(Person person) throws ClassNotFoundException, SQLException {
		 
		if((DbConfig.getHandle().createUpdate("insert into person (personId, personName, phoneNumbers, address, pin) values (:personId, :personName, :phoneNumbers, :address , :pin)")
	      .bindBean(person)
	      .execute())>0) {
		return Response.status(Response.Status.OK).build();
		}
				
		else 
			return Response.status(Response.Status.NOT_MODIFIED).build();
	    

	}

 
 
	 
	public List<Person> getPersonById(int id) throws ClassNotFoundException, SQLException {
		
	List<Person> things = DbConfig.getHandle().createQuery("select * from things where id in (<ids>)")
		     .bindList("ids", 1, 2, 3)
		     .mapTo(Person.class)
		     .list();

		
		return things;
	}

	public Response updateContact(Person person, int id) throws ClassNotFoundException, SQLException {
		 //update person
		if( (DbConfig.getHandle().createUpdate("update person set name= ? , phone=? ,street= ? , city=? , pin=? where id=?")
		.bind(0, person.getName())
		.bind(1, person.getPhone())
		.bind(2, person.getStreet())
		.bind(3, person.getCity())
		.bind(4, person.getPin())
		.bind(5, id)
		.bindBean(Person.class)
		.execute()) >0)  {
			return Response.status(Response.Status.OK).build();
			}
					
			else 
				return Response.status(Response.Status.NOT_MODIFIED).build();
		
	}

	@Override
	public List<Map<String, Object>> getAllRecords() throws ClassNotFoundException, SQLException {
		List<Map<String, Object>> listMap= DbConfig.getHandle().createQuery("select * from person")
				.mapToMap()
				.list();
		return listMap;
	}

	 
 	 
}
