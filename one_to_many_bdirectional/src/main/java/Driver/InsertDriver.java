package Driver;

import entity.College;
import entity.Student;

import javax.persistence.*;
import java.util.Arrays;

public class InsertDriver {

    public static void main(String[] args) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("postgres");

        EntityManager em = emf.createEntityManager();

        //find for eager loading
        College c=em.find(College.class, 1);
        System.out.println(c);
        
        EntityTransaction et = em.getTransaction();
//        et.begin();

        // Create College
//        College college = new College();
//        college.setName("ABC College");
//
//        // Create Students
//        Student s1 = new Student();
//        s1.setName("Krish");
//
//        Student s2 = new Student();
//        s2.setName("Rahul");
//
//        // Link both sides properly
//        s1.setCollege(college);
//        s2.setCollege(college);
//
//        college.setStudents(Arrays.asList(s1, s2));
//
//        // Persist only college (Cascade will handle students)
//        em.persist(college);
//
//        et.commit();
//
//        em.close();
//        emf.close();
//
//        System.out.println("Data inserted successfully!");
    }
}
