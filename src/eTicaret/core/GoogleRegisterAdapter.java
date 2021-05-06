package eTicaret.core;

import eTicaret.entities.concretes.Register;
import googleRegister.GoogleRegister;

public class GoogleRegisterAdapter implements GoogleRegisterService {
	
	private ValidationEpostaService validationepostaService;
	public GoogleRegisterAdapter(ValidationEpostaService validationepostaService) {
		this.validationepostaService=validationepostaService;
	}

	@Override
	public void register(Register register) {
		GoogleRegister googleRegister=new GoogleRegister();
		if(this.validationepostaService.getClick()==false) {
			System.out.println("dogrulama linki hatas�, �yelik kabul edilmedi");
			
		}
		else {
			googleRegister.register(register.getFirstName());
		}
		
		
	}

}
