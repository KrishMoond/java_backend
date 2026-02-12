package com.prac;

import javax.persistence.EntityManagerFactory;
import javax.persistence.*;

public class Demofetch {
	public static void main(String args[]) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgres"); // opeining closing
		
		EntityManager em= emf.createEntityManager();
		EntityTransaction et= em.getTransaction();
		
		Student s=em.find(Student.class, 1); // this find method will accept primary key
//		System.out.println(s.getId()+" Student Name "+ s.getName()+" percentage "+ s.getPercent());
		
		et.begin();
		em.remove(s);
		et.commit();
		emf.close();
		
		
	}
}
