package eTicaret.dataAccess.concretes;

import java.util.List;

import eTicaret.dataAccess.abstracts.RegisterDao;
import eTicaret.entities.concretes.Register;

public class HibernaeteRegisterDao implements RegisterDao{

	@Override
	public void add(Register register) {
		System.out.println("hibernaete ile üye olundu."+register.getFirstName());
		
	}

	@Override
	public void delete(Register register) {
		System.out.println("hibernaete ile üyelik silindi. "+register.getFirstName());
		
	}

	@Override
	public void update(Register register) {
		System.out.println("hibernaete ile üye güncellendi. "+register.getFirstName());
		
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

}
