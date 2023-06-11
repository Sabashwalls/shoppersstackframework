package Framework;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HybridFRM3 extends BaseClassFRM{

	static POM frame;
	

	@Test
	public void MN_035andMN_036() throws InterruptedException, IOException {
		Thread.sleep(4000);
		frame = new POM();
		PageFactory.initElements(sabash, frame);
		Thread.sleep(5000);
		frame.compareicon();
		Thread.sleep(5000);

	}
	
	@Test
	public void MN_037() throws InterruptedException {

		Thread.sleep(4000);
		frame.validpin();
	}
	
	@Test
	public void MN_038() throws InterruptedException {

		Thread.sleep(4000);
		frame.invalidpin();	
	}

	@Test
	public void MN_039() throws InterruptedException {

		Thread.sleep(4000);
		frame.checkdeliverablepin();
	}
	
	@Test
	public void MN_040() throws InterruptedException {

		Thread.sleep(4000);
		frame.deliverablepinsection();
	}
	
	@Test
	public void MN_041() throws InterruptedException {

		Thread.sleep(4000);
		frame.buynow();
	}
	
	@Test
	public void MN_042() throws InterruptedException {

		Thread.sleep(4000);
		frame.addresssection();
	}
	
	@Test
	public void MN_043() throws InterruptedException {

		Thread.sleep(4000);
		frame.invalidaddress();
	}
	
	@Test
	public void MN_044() throws InterruptedException {

		Thread.sleep(4000);
		frame.validaddress();
	}
	
	@Test
	public void MN_045() throws InterruptedException {
		
		Thread.sleep(4000);
		frame.addcarddebit1();
	}
	
	@Test
	public void MN_046() throws InterruptedException {
		
		
		Thread.sleep(4000);
		frame.addcarddebit2();
	}
	
	@Test
	public void MN_047() throws InterruptedException {
		
		Thread.sleep(4000);
		frame.addcarddebit3();
	}
	
	@Test
	public void MN_048() throws InterruptedException {
		
		Thread.sleep(4000);
		frame.addcardcredit1();
	}
	
	@Test
	public void MN_049() throws InterruptedException {
		
		Thread.sleep(4000);
		frame.addcardcredit2();
	}
	
	@Test
	public void MN_050() throws InterruptedException {
		
		Thread.sleep(4000);
		frame.addcardcredit3();
	}
}
