package eTicaret.business.concretes;

import java.util.List;
import java.util.regex.*;

import eTicaret.business.abstracts.AuthService;
import eTicaret.core.ValidationEpostaService;
import eTicaret.dataAccess.abstracts.RegisterDao;
import eTicaret.entities.concretes.Register;

public class AuthManager implements AuthService{
	
	private RegisterDao registerDao;
	private ValidationEpostaService validationepostaService;
	
	public AuthManager(RegisterDao registerDao,ValidationEpostaService validationepostaService) {
		this.registerDao=registerDao;
		this.validationepostaService=validationepostaService;
	}

	@Override
	public void register(Register register, String[] mails) {
		
		Pattern pattern = Pattern.compile("@");
	    Matcher matcher = pattern.matcher(register.getEmail());
	    boolean matchFound = matcher.find();
	    
	    for(String reg:mails) {
	
		if(register.getFirstName().length() < 2 || register.getLastName().length() < 2) {
			System.out.println("ad ve soyad en az 2 karakter uzunlugunda olmalý");
			return;
		}
		
		
			if(!matchFound ) {
				
				System.out.println("email formatýna uygun deðil.");
				return;
			
		}
			if(reg==register.getEmail()) {
				System.out.println("bu email kullanýmda ");
				return;
			}
			
			if(register.getPassword().length()<5 ) {
				System.out.println("þifre en az 6 karakter olmalý");
				return;
				
			}
			if(this.validationepostaService.getClick()==false) {
				System.out.println("dogrulama linki hatasý, üyelik kabul edilmedi");
				return;
			}
	}
			
	    this.registerDao.add(register);
		
		
	  
		
	}

	@Override
	public void delete(Register register) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Register register) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Register get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Register> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void user(String email, String password) {
		System.out.println("giriþ baþarýlý: "+email);
		
	}

}
