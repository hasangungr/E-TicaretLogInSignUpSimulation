package Day5Eticaret.core;

import Day5Eticaret.entities.concretes.User;

public class DogrulamaMail {
	public static void send(User user) {
		System.out.println("E-Posta G�nderildi: "+user.getMail());
	}
	public static void check(User user) {
		
	}
	
}
