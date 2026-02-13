package mockito_basics;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

public class UserServiceTest {

    @Test
    public void testRegularUser() {

        // 1️⃣ Create mock object
        UserDao mockDao = mock(UserDao.class);

        // 2️⃣ Create dummy user
        User dummyUser = new User();
        dummyUser.setId(1);
        dummyUser.setName("Avni");
        dummyUser.setBalance(1500);

        // 3️⃣ Define mock behavior
        when(mockDao.findById(1)).thenReturn(dummyUser);

        // 4️⃣ Inject mock into service
        UserService service = new UserService(mockDao);

        // 5️⃣ Call method
        String result = service.typeOfUser(1);

        // 6️⃣ Verify result
        assertEquals("regular user", result);
    }
}
