package one_to_one_mapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class User {
	
	public static void FindCar() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("postgres");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et= em.getTransaction();
		
		 Car c=em.find(Car.class,1);
		 System.out.println(c);
		 
	}
	
	public static void findCar(int id) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("postgres");
		EntityManager em= emf.createEntityManager();
		Car c=em.find(Car.class,3);
//		System.out.println(c);
//		System.out.println(c.getEngine()+" "+c.getModel());
		
		System.out.println("============");
		em.clear(); //clear cache then it will query again 
		Car c1=em.find(Car.class,3); //load data from cache

		
	}
	public static void DelEng(int id) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("postgres");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et= em.getTransaction();
		
		et.begin();
		Car car = em.createQuery(
	            "SELECT c FROM Car c WHERE c.engine.id = :eid", Car.class)
	            .setParameter("eid", id)
	            .getSingleResult();

	    if (car != null) {
	        car.setEngine(null);
	    }

	    Engine e = em.find(Engine.class, id);
	    if (e != null) {
	        em.remove(e);
	    }

	    et.commit();
	    em.close();
	    emf.close();
	}
	
	public static void InsertCar() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("postgres");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et= em.getTransaction();
		
		Engine e= new Engine();
		e.setId(3);
		e.setType("Rotar");
		e.setFuelType("Petrol");
		e.setCc("3500");
		e.setMileage("10");
		
		Car c= new Car();
		c.setId(3);
		c.setBrand("Maruti");
		c.setColour("White");
		c.setModel("800");
		c.setModelYear("2010");
		c.setEngine(e);
		et.begin();
		em.persist(e);
		em.persist(c);
		et.commit();
		
		
		emf.close();
	}
	public static void main(String[] args) {
//		Persistence.createEntityManagerFactory("postgres");
		
//		InsertCar();
//		FindCar();
//		DelEng(1);
		findCar(3);
		
	}
}