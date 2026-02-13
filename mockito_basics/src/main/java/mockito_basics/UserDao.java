package mockito_basics;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class UserDao {
	// only crud operation in userDao not main no calculations
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgres");
	EntityManager em = emf.createEntityManager();

	public void insertUsers() {
		EntityTransaction et = em.getTransaction();
		User user = new User();
		user.setId(1);
		user.setName("Avni");
		user.setBalance(2000);

		et.begin();
		em.persist(user);
		et.commit();

	}

	public User findById(int id) {
	    return em.find(User.class, id);   // ✅ use parameter
	}
}