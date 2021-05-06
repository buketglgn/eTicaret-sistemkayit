package eTicaret.business.abstracts;

import java.util.List;

import eTicaret.entities.concretes.Register;

public interface AuthService {
	
	public void register(Register register, String[] mails);
	public void user(String email, String password);
	
	public void delete(Register register);
	public void update(Register register);
	Register get (int id);
	List<Register> getAll();


}
