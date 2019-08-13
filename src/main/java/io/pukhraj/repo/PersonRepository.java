/**
 * 
 */
package io.pukhraj.repo;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.ws.rs.core.Response;

import org.jdbi.v3.sqlobject.config.RegisterBeanMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.customizer.BindBean;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import io.pukhraj.model.Person;

/**
 * @author pukhraj
 *
 */
public interface PersonRepository {

	// public abstract List<Map<String, Object>> getAllPersons(int id) throws
	// ClassNotFoundException;

	 

	public abstract List<Person> getPersonById(int id) throws ClassNotFoundException, SQLException;

	public abstract Response createContact(Person person) throws ClassNotFoundException, SQLException;

	public abstract Response updateContact(Person person, int id) throws ClassNotFoundException, SQLException;
	
	public abstract List<Map<String, Object>> getAllRecords() throws ClassNotFoundException, SQLException;

}
