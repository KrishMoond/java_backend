package mockito;

public class UserService {

    private UserDao dao;

    public UserService(UserDao dao) {
        this.dao = dao;
    }

    public String typeOfUser(int id) {

        User user = dao.findById(id);

        if (user == null) {
            return "user not found";
        }

        double balance = user.getBalance();

        if (balance > 0 && balance <= 1000) {
            return "new user";
        } 
        else if (balance > 1000 && balance <= 2000) {
            return "regular user";
        } 
        else {
            return "premium user";
        }
    }
}
