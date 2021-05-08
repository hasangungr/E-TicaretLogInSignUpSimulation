package Day5Eticaret.dataAccess.concretes;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Day5Eticaret.dataAccess.abstracts.IUserDao;
import Day5Eticaret.entities.concretes.User;

public class HibernateUserDao implements IUserDao{
	HashMap<String,String> mailpassHashMap = new HashMap<String, String>(); 

	
	@Override
	public void Add(User user) {
		System.out.println("Kullanýcý Eklendi: "+user.getFirstName());
		
		
		mailpassHashMap.put(user.getMail(), user.getPassword());
	}

	@Override
	public void Delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Update(User user) {
		// TODO Auto-generated method stub
		
	}

	

	
	
	public HashMap<String, String> mailpass()
	{
		return mailpassHashMap;
		
	}
	


}
