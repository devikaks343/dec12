package Testpkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Basepkg.Basecls;
import Excelutlise.exlutlise;
import pagepkg.Fbloginpage;

public class Fblogintest  extends Basecls{
	
	@Test
	public void verifyloginwithvalidcred()throws Exception
	{
		Fbloginpage p1=new Fbloginpage(driver);
		String x1="C:\\Users\\devik\\OneDrive\\Desktop\\bookface.xlsx";
		String sheet="Sheet1";
		int rowCount=exlutlise.getrowcount(x1, sheet);
		for(int i=1;i<=rowCount;i++)
		{
			String UserName =exlutlise.getCellValue(x1, sheet, i, 0);
			System.out.println("username    "+UserName);
			String Pwd=exlutlise.getCellValue(x1, sheet, i, 1);
			System.out.println("password      "+Pwd);
			p1.setvalues(UserName, Pwd);
			p1.loginclick();
		}
		
		
	}

}
	
	
