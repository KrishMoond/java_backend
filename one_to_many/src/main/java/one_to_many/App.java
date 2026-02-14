package one_to_many;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {

    public static void main(String[] args) {

        EntityManagerFactory emf =Persistence.createEntityManagerFactory("postgres");
        EntityManager em = emf.createEntityManager();

        // Create Students
        Student s1 = new Student();
        s1.setId(101);
        s1.setName("Krish");
        s1.setBranch("CSE");

        Student s2 = new Student();
        s2.setId(102);
        s2.setName("Yamsh");
        s2.setBranch("IT");

        // Create College
        College college = new College();
        college.setId(1);
        college.setName("GJU");
        college.setLoc("Hisar");
        college.setPri("Koi nhi");

        // Add students to college
        college.setStudents(Arrays.asList(s1, s2));

        em.getTransaction().begin();

        // Persist students first
        em.persist(s1);
        em.persist(s2);

        // Persist college
        em.persist(college);

        em.getTransaction().commit();

        em.close();
        emf.close();

        System.out.println("Data Inserted Successfully");
    }
}
