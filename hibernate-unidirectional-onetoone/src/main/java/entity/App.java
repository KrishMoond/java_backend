package entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App {

    public static void main(String[] args) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("postgres");

        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();

        // Save AadharCard
        AadharCard aadhar = new AadharCard();
//        aadhar.setAadharId(101);
        aadhar.setAadharNumber("1234-5678-9999");
        aadhar.setAddress("Hisar");
        aadhar.setIssueDate("2026");
        em.persist(aadhar);

        // Save HostelRoom
        HostelRoom room = new HostelRoom();
//        room.setRoomId(2010);
        room.setRoomNumber("C-109");
        room.setBlockName("C");
        room.setFloorNumber(1);
        em.persist(room);

        // Save Student
        Student student = new Student();
//        student.setStudentId(10);
        student.setName("Krish");
        student.setEmail("krish@gmail.com");
        student.setBranch("Btech");
        student.setAadharCard(aadhar);
        student.setHostelRoom(room);

        em.persist(student);

        tx.commit();

        System.out.println("Data Inserted Successfully ✅");

        // FETCH
        Student s = em.find(Student.class, 1);

        System.out.println("Student: " + s.getName());
        System.out.println("Aadhar: " + s.getAadharCard().getAadharNumber());
        System.out.println("Room: " + s.getHostelRoom().getRoomNumber());

        // DELETE Student ONLY
        tx.begin();
        em.remove(s);
        tx.commit();

        System.out.println("Student Deleted Only ✅");

        em.close();
        emf.close();
    }
}
