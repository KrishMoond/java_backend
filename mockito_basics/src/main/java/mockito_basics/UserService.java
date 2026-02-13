package mockito_basics;

///Bussiness logic
public class UserService {

    UserDao dao;

    public UserService(UserDao dao) {
        this.dao = dao;
    }

    public String typeOfUser(int id) {

        User user = dao.findById(id);

        if (user == null) {
            return "user not found";
        }

        int balance = user.getBalance();

        if (balance > 0 && balance <= 1000) {
            return "new User";
        } else if (balance > 1000 && balance <= 2000) {
            return "regular user";
        } else {
            return "premium user";
        }
    }
}
