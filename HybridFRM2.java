package Framework;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HybridFRM2 extends BaseClassFRM{

	static POM frame;

	@Test
	public void MN_016() throws InterruptedException, IOException {
		Thread.sleep(4000);
		frame = new POM();
		PageFactory.initElements(sabash, frame);
		Thread.sleep(5000);
		frame.trousers();
	}

	@Test
	public void MN_017() throws InterruptedException {
		Thread.sleep(2000);
		frame.shorts();
	}

	@Test
	public void MN_018() throws InterruptedException {
		Thread.sleep(2000);
		frame.trackspantsjoggers();
	}
	
	@Test
	public void MN_019() throws InterruptedException {
		Thread.sleep(2000);
		frame.likebuttonverify();
	}
	
	@Test
	public void MN_020() throws InterruptedException {
		Thread.sleep(2000);
		frame.addtocartbuttonverify();
	}
	
	@Test
	public void MN_021() throws InterruptedException {
		Thread.sleep(2000);
		frame.ratingpresent();
	}
	
	@Test
	public void MN_022() throws InterruptedException {
		Thread.sleep(2000);
		frame.starverification();
	}
	
	@Test
	public void MN_023() throws InterruptedException {
		Thread.sleep(2000);
		frame.decimalvalue();
	}
	
	@Test
	public void MN_024() throws InterruptedException {
		Thread.sleep(2000);
		frame.pricelist();
	}
	
	@Test
	public void MN_025() throws InterruptedException {
		Thread.sleep(2000);
		frame.rupees();
	}
	
	@Test
	public void MN_026() throws InterruptedException {
		Thread.sleep(2000);
		frame.discount();
	}
	
	@Test
	public void MN_027() throws InterruptedException {
		Thread.sleep(2000);
		frame.image();
	}
	
	@Test
	public void MN_030() throws InterruptedException {
		Thread.sleep(2000);
		frame.addtocartbutton();
	}
	
	@Test
	public void MN_032() throws InterruptedException {
		
		Thread.sleep(2000);
		frame.firstproduct();
	}
	
	@Test
	public void MN_033() throws InterruptedException {
		Thread.sleep(2000);
		frame.firstproductback();
	}
	
	@Test
	public void MN_034() throws InterruptedException {
		Thread.sleep(2000);
		frame.review();
	}
}