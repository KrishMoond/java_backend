package com.prac;

//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;
import javax.persistence.*;


public class Demo {
	public static void main(String[] args) {
//		Responsible for setting up JPA configuration and DB connection
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgres"); // opeining closing
		
		EntityManager mm =emf.createEntityManager(); // Create EntityManager for performing database operations
		
		//Entity transaction interface
		EntityTransaction et= mm.getTransaction(); // Obtain EntityTransaction to manage transaction boundaries
		
		// Create and populate entity object
		Student s= new Student();
		s.setId(2);
		s.setName("Yamsh");
		s.setPer(81.4);
		
		et.begin();
		mm.persist(s); // Persist entity object (INSERT into database)
		et.commit();
		emf.close();
	}
}
