package pgmm2;
import org.testing.Assert;
import org.testing.annotation.test;

import kalpana.App;


public class p12 {
	public void testlogin1()
	{
		App myapp=new App();
		Assert. assertequals(0, myapp.userlogin("abc","abc@123"));
	}
	public void testlogin2()
	{
		App myapp=new App();
		Assert. assertequals(1, myapp.userlogin("abc","abc@123"));
		
	}

}
