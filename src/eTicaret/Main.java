package eTicaret;

import eTicaret.business.concretes.AuthManager;
import eTicaret.core.GoogleRegisterAdapter;
import eTicaret.core.ValidationEpostaManager;
import eTicaret.dataAccess.concretes.HibernaeteRegisterDao;
import eTicaret.entities.concretes.Register;

public class Main {

	public static void main(String[] args) {
		
		Register buket=new Register(1,"buket","gülgün","125678","buketglgn@gmail.com");
		Register ceylin=new Register(1,"ceylin","gülgün","0987654","ceycey@gmail.com");
		
		String[] mails= {ceylin.getEmail()};
		
		AuthManager authManager= new AuthManager(new HibernaeteRegisterDao(), new ValidationEpostaManager());
		authManager.register(buket,mails);
		authManager.user(ceylin.getEmail(), ceylin.getPassword());
		
		GoogleRegisterAdapter googleregisterManager=new GoogleRegisterAdapter(new ValidationEpostaManager());
		// googleregisterManager.register(buket);
		
		
		
		

	}

}
