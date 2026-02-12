package com.prac;

import java.util.List;
import javax.persistence.*;

public class ProductDao {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgres");
    EntityManager em = emf.createEntityManager();

    // 1️⃣ INSERT Product
    public String insertProduct(Product p) {
        EntityTransaction et = em.getTransaction();
//        et.begin();
//        em.persist(p);
//        et.commit();
//        System.out.println("Data Inserted");
        if(p!=null) {
        	et.begin();
        	em.persist(p);
        	et.commit();
        	return "Data Inserted";
        }
        else {
        	return "Illegal Argument";
        }
    }

    // 2️⃣ DELETE Product by ID
//    public void deleteProduct(int id) {
//        Product p = em.find(Product.class, id);
//        if (p != null) {
//            EntityTransaction et = em.getTransaction();
//            et.begin();
//            em.remove(p);
//            et.commit();
//            System.out.println("Product deleted successfully.");
//        } else {
//            System.out.println("Product not found.");
//        }
//    }
    
    public String deleteProduct(int id) {
        Product p = em.find(Product.class, id);

//        if (p != null) {       
//            em.remove(p);
//        } else {               
//            System.out.println("Product not found.");
//        }
        EntityTransaction et = em.getTransaction();
        if(p!=null) {
        	et.begin();
        	em.remove(p);
        	et.commit();
        	return "Data Deleted";
        }
        else {
        	return "Id ";
        }
    }

    // 3️⃣ UPDATE Product
    public void updateProduct(Product p) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.merge(p);
        et.commit();
        System.out.println("Product updated successfully.");
    }

    // 4️⃣ FIND Product by ID
    public Product findProduct(int id) {
        return em.find(Product.class, id);
    }

    // 5️⃣ FIND ALL Products
    public List<Product> findAllProducts() {
        Query q = em.createQuery("SELECT p FROM Product p");
        return q.getResultList();
    }

}