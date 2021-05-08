package Day5Eticaret.dataAccess.abstracts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Day5Eticaret.entities.concretes.User;

public interface IUserDao {
	void Add(User user);
	void Delete(User user);
	void Update(User user);
	HashMap<String, String> mailpass();
		
}
