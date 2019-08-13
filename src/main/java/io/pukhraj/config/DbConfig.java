package io.pukhraj.config;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.Properties;

import org.jdbi.v3.core.Handle;
import org.jdbi.v3.core.Jdbi;
import org.sqlite.SQLiteDataSource;

public class DbConfig {

	/*public static void DbConn() throws ClassNotFoundException {
		Class.forName("org.sqlite.JDBC");
		String path = "/D:/Users/703222148/Downloads/All/Pukhraj/softwares/sqlite studio/pukhraj.db";
		SQLiteDataSource ds = new SQLiteDataSource();
		ds.setUrl("jdbc:sqlite:" + path);
	}*/

	public static Handle getHandle() throws ClassNotFoundException, SQLException {

		Handle handle = getJDBI().open();
		return handle;
	}

	public static Jdbi getJDBI() throws ClassNotFoundException, SQLException {
	 
			Class.forName("org.sqlite.JDBC");
			
			  Properties prop = new Properties();
			  InputStream inStream = DbConfig.class.getResourceAsStream("db.properties");
			  try {
				prop.load(inStream);
			} catch (IOException e) {
				 
				e.printStackTrace();
			}
			  
			 
			String path = prop.getProperty("db.uri"); 
			SQLiteDataSource ds = new SQLiteDataSource();
			ds.setUrl("jdbc:sqlite:" + path);
			ds.getConnection();
			
			Jdbi jdbi = Jdbi
					.create(prop.getProperty("db.uri"));
			return jdbi;
	 
		 
		/* jdbi.installPlugin(new SqlObjectPlugin()); */
		 

	}

}
