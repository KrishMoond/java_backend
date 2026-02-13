package mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

public class UserServiceTest {
	@Test
public void typeOfUser() {
	
	//create mock object
	UserDao daomock= mock(UserDao.class);
	
	//create fake object
	User fakeObject=new User();
	fakeObject.setId(1);
	fakeObject.setBalance(2000);
	fakeObject.setName("krish");
	
	//mention what object should return
	when(daomock.findById(1)).thenReturn(fakeObject);
	
	User user1=new User();
	user1.setId(2);
	user1.setBalance(1000);
	user1.setName("Miller");
	when(daomock.findById(2)).thenReturn(user1);
	
	//earlier passing actual real database reference	
	UserService service=new UserService(daomock);
	
	String res=service.typeOfUser(1);
	
	assertEquals("regular user",res);
	
}

}