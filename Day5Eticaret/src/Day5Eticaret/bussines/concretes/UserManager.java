package Day5Eticaret.bussines.concretes;

import javax.swing.plaf.synth.SynthGraphicsUtils;


import Day5Eticaret.bussines.abstracts.UserService;
import Day5Eticaret.core.DogrulamaMail;
import Day5Eticaret.core.EmailValidator;
import Day5Eticaret.dataAccess.concretes.HibernateUserDao;
import Day5Eticaret.entities.concretes.User;


public class UserManager implements UserService{

	
	EmailValidator mailValidator;
	HibernateUserDao hiberDao;
	DogrulamaMail dogrulamaMail;
	public UserManager() {
		
	}
	public UserManager(EmailValidator mailValidator, HibernateUserDao hiberDao,DogrulamaMail dogrulamaMail) {
		super();
		this.mailValidator = mailValidator;
		this.hiberDao = hiberDao;
		this.dogrulamaMail = dogrulamaMail;
		
	}
	public boolean mailCheck2(User user) {
		if(hiberDao.mailpass().containsKey(user.getMail())) {
			return true;
		}
		
		return false;
	}
		
		
	

	@Override
	public void signUp(User user) {
		boolean mail = mailValidator.isEmailValid(user.getMail());

		if(user.getPassword().length()<=6 || user.getFirstName().length()<=2 || user.getLastName().length()<=2 || mail == false || mailCheck2(user) ==true) {
			System.out.println("Giriþ Bilgilerinizi Kontrol Ediniz. Mail, Ad Soyad, Þifre");
		}
		else {
			hiberDao.Add(user);
			System.out.println("Kayýt Baþarýlý");
			dogrulamaMail.send(user);
		}
		
		
	}
	public boolean checkLogIn(User user) {
		if(hiberDao.mailpass().containsKey(user.getMail()) || hiberDao.mailpass().containsValue(user.getPassword())) {
			return true;
		}
		return false;
			
		}
	@Override
	public void logIn(User user) {
		if(checkLogIn(user) == true) {
			System.out.println("Giriþ");
		}
		else {
			System.out.println("Giriþ Baþarýsýz.");
		}
		
	}

}
