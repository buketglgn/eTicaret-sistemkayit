package eTicaret.core;

public class ValidationEpostaManager implements ValidationEpostaService {

	@Override
	public void sendToMail(String message) {
		System.out.println("doğrulama linki mail e gönderildi. "+message);
		
	}

	@Override
	public boolean getClick() {

		 return true;
		
	}

}
