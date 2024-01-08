package scripts;

import org.testng.annotations.Test;

import genericlibraries.baseclass;
import pompages.Skillrarydemoapp;
import pompages.Skillraryloginpage;
import pompages.addtocart;

public class testcase1 extends baseclass {
	@Test
	public void tc1() {
		Skillraryloginpage s=new Skillraryloginpage(driver);
		s.gerasbutton();
		s.skillrarydemoapp();
	Skillrarydemoapp sd=new Skillrarydemoapp(driver);
	driverutilites.Switchingtabs(driver);
	driverutilites.mousehover(driver, sd.getCoursebtn());
	sd.seleniumtrainingtab();
	
	addtocart ad=new addtocart(driver);
	driverutilites.doubleclick(driver,ad.getAddbtn());
	ad.addtocartt();
	driverutilites.alertpopup(driver);
	
	}

}
