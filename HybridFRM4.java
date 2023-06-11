package Framework;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HybridFRM4 extends BaseClassFRM{

	
	static POM frame;

	@Test
	public void MN_051() throws InterruptedException {
		Thread.sleep(4000);
		frame = new POM();
		PageFactory.initElements(sabash, frame);
		Thread.sleep(4000);
		frame.removecard();
	}
	
	@Test
	public void MN_052() throws InterruptedException {
		
		Thread.sleep(4000);
		frame.clearsection();
	}
	
	@Test
	public void MN_053() throws InterruptedException {
		
		Thread.sleep(4000);
		frame.cashondelivery();
	}
	
	@Test
	public void MN_054() throws InterruptedException {
		
		Thread.sleep(3000);
		frame.netbanking();
	}
	
	@Test
	public void MN_055() throws InterruptedException {
			
		Thread.sleep(4000);
		frame.orderplace();
	}
	
	@Test
	public void MN_056() throws InterruptedException {
			
		Thread.sleep(4000);
		frame.conformationpage();
	}
}
