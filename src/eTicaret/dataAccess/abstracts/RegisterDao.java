package eTicaret.dataAccess.abstracts;

import java.util.List;

import eTicaret.entities.concretes.Register;


public interface RegisterDao {
	
	public void add(Register register);
	public void delete(Register register);
	public void update(Register register);
	Register get (int id);
	List<Register> getAll();

}
