import Day5Eticaret.bussines.concretes.UserManager;
import Day5Eticaret.core.DogrulamaMail;
import Day5Eticaret.core.EmailValidator;
import Day5Eticaret.core.Google;
import Day5Eticaret.dataAccess.concretes.HibernateUserDao;
import Day5Eticaret.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user = new User(2,"Ekrem","Güngör","hasan1","12343232","hasan@gmail.com");
		User user1 = new User(1,"Hasan","Güngör","Haasdasd","9585855","hasan1@gmail.com");
		User user3 = new User(2,"Ekrem","Güngör","hasan1","132","hasan@gmail.com");
		UserManager manager = new UserManager(new EmailValidator(), new HibernateUserDao(), new DogrulamaMail());
		manager.signUp(user);
		manager.signUp(user1);
		manager.signUp(user3);
		manager.logIn(user3);

		System.out.println("Google");
		Google google = new Google();
		google.logIn(user1);
		google.signUp(user);
		System.out.println("Giriþ");
		
	}

}
