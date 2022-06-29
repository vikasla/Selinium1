package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pack.Loginpage;

public class Logintest extends Basetest{
	
	public Loginpage m1;
	@BeforeClass
	public void m2() {
		m1= new Loginpage(driver);
		
	}
		@Test
		public void m3() throws InterruptedException {
			m1.Logintest1("Pass@123", "VPY774" ,"123456");
			Thread.sleep(2000);
		}
	}


