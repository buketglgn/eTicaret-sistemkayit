package eTicaret.core;

public class ValidationEpostaManager implements ValidationEpostaService {

	@Override
	public void sendToMail(String message) {
		System.out.println("do�rulama linki mail e g�nderildi. "+message);
		
	}

	@Override
	public boolean getClick() {

		 return true;
		
	}

}
