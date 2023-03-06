package interfaces;

public class SmsLogger implements Logger {// logger'i SmsLogger a uyarla yani gerekli olan kodları yaz 
											//inheritance gerekli olan kodları yazmak zorunda değildik istersek üzerine yazıyorduk override diyoruz buna.
	

	@Override
	public void log(String message) {
		System.out.println("sms gonderildi :"+message);
		
	}
	
	
}
