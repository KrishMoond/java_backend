package many_to_many_bidirectional;

import java.util.Arrays;
import javax.persistence.*;

public class Main {

    public static void main(String[] args) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("postgres");

        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        // Create Students
        Student s1 = new Student();
        s1.setName("Krishh");
        s1.setGender("Male");
        s1.setBranch("CSE");

        Student s2 = new Student();
        s2.setName("hioioafsdfsda");
        s2.setGender("Female");
        s2.setBranch("IT");

        // Create Subjects
        Subject sub1 = new Subject();
        sub1.setName("Java");
        sub1.setNoOfDays(30);

        Subject sub2 = new Subject();
        sub2.setName("SQL");
        sub2.setNoOfDays(20);

        // Set relationships (VERY IMPORTANT for bidirectional)
        s1.setSubjects(Arrays.asList(sub1, sub2));
        s2.setSubjects(Arrays.asList(sub1));

        sub1.setStudent(Arrays.asList(s1, s2));
        sub2.setStudent(Arrays.asList(s1));

        et.begin();

        // Persist subjects first (good practice)
        em.persist(sub1);
        em.persist(sub2);

        em.persist(s1);
        em.persist(s2);

        et.commit();

        em.close();
        emf.close();
    }
}