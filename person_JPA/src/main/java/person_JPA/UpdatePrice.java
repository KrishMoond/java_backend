package person_JPA;

import javax.persistence.*;

public class UpdatePrice {

    public static void main(String[] args) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("postgres");

        EntityManager em = emf.createEntityManager();

        EntityTransaction et = em.getTransaction();

        String jpql =
                "Update Product p set p.price = ?1 where p.price = ?2";

        et.begin();

        Query query = em.createQuery(jpql);
        query.setParameter(1, 80.0);
        query.setParameter(2, 100.0);

        query.executeUpdate();

        et.commit();

        em.close();
        emf.close();
    }
}

