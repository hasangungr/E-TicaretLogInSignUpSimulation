package Day5Eticaret.Google;

import Day5Eticaret.entities.concretes.User;

public class GoogleSystems {
	public void logIn(User userMail,User userPassword) {
		System.out.println("Google ile Giri� Yap�ld� : "+ userMail.getMail());
	}
	
	public void SingUp(User userMail,User userPassword) {
		System.out.println("Google ile kay�t olundu: "+userMail.getMail());
	}
}
