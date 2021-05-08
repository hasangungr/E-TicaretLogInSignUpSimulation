package Day5Eticaret.core;
import Day5Eticaret.*;
import Day5Eticaret.Google.GoogleSystems;
import Day5Eticaret.entities.concretes.User;

public class Google implements DisServisHesaplari{
	GoogleSystems google = new GoogleSystems();
	@Override
	public void signUp(User user) {
		google.SingUp(user, user);
		
	}
	
	@Override
	public void logIn(User user) {
		google.SingUp(user, user);
		
	}

}
