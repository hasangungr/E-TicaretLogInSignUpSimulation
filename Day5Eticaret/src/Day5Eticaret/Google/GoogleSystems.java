package Day5Eticaret.Google;

import Day5Eticaret.entities.concretes.User;

public class GoogleSystems {
	public void logIn(User userMail,User userPassword) {
		System.out.println("Google ile Giriþ Yapýldý : "+ userMail.getMail());
	}
	
	public void SingUp(User userMail,User userPassword) {
		System.out.println("Google ile kayýt olundu: "+userMail.getMail());
	}
}
