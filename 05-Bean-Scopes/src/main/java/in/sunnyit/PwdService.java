package in.sunnyit;

import java.util.Base64;
import java.util.Base64.Encoder;

public class PwdService {

	public PwdService ()
	{
		System.out.println("PwdService class :: Constructor");
	}
	
	public String ecryptPwd(String pwd)
	{
		Encoder encod=Base64.getEncoder();
		byte[] encodedValue=encod.encode(pwd.getBytes());
		
		return new String(encodedValue);
	}
	
}
