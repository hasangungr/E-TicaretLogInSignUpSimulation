package Day5Eticaret.bussines.abstracts;

import Day5Eticaret.entities.concretes.User;

public interface UserService {
	void logIn(User user);
	void signUp(User user);
}
