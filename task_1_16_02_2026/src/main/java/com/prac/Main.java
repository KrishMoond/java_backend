import javax.persistence.*;

public class Main {

    public static void main(String[] args) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("postgres");

        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        // Register User
        User user = new User("Krish", "1234", "krish@gmail.com");
        em.persist(user);

        // Create Post
        Post post = new Post("Hibernate Guide",
                "Unidirectional Mapping Example", user);
        em.persist(post);

        // Add Comment
        Comment comment = new Comment("Great Post!", post, user);
        em.persist(comment);

        em.getTransaction().commit();

        System.out.println("Data Inserted Successfully ✅");

        em.close();
        emf.close();
    }
}
