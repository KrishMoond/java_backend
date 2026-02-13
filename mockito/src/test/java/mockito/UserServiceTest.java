package mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class UserServiceTest {

    @Test
    public void testRegularUser() {

        // Create mock DAO
        UserDao dao = mock(UserDao.class);

        // Create fake user
        User fakeUser = new User();
        fakeUser.setId(1);
        fakeUser.setName("Krish");
        fakeUser.setBalance(1500);   

        // Define mock behaviour
        when(dao.findById(1)).thenReturn(fakeUser);

        // Inject mock into service
        UserService service = new UserService(dao);

        String result = service.typeOfUser(1);

        assertEquals("regular user", result);
    }
}
