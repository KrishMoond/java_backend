package person_JPA;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ProductDao {

    private EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("postgres");

    private EntityManager em = emf.createEntityManager();

    // ✅ INSERT METHOD (Correct Way)
    public void insertProduct(Product p) {

        EntityTransaction et = em.getTransaction();

        try {
            et.begin();

            em.persist(p);   // 🔥 This inserts into database

            et.commit();

            System.out.println("Product inserted successfully ✅");

        } catch (Exception e) {
            et.rollback();
            e.printStackTrace();
        }
    }

    public void close() {
        em.close();
        emf.close();
    }
}
