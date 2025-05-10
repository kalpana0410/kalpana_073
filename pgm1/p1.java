package pgm1;

import java.util.ResourceBundle;

public class p1 {
	public int userlogin(String in_user,String in_qwd)
	{
		ResourceBundle rb=ResourceBundle .getBundle("config");
		String username=rb.getString("username");
		String password=rb.getString("password");
		if(in_user.equals(username)&& in_qwd.equals(password))
			return 1;
		else
			return 0;
		
		
	}

}
