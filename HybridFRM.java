package Framework;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HybridFRM extends BaseClassFRM{
	
	 static POM frame;
	
	@Test
	public void MN_002() throws InterruptedException, IOException {
		frame = new POM();
		PageFactory.initElements(sabash, frame);
		Thread.sleep(5000);
		frame.invalidlog();
	}
	
	@Test
	public void MN_003() throws InterruptedException {
		
		frame.Menmodule();
	}
	
	@Test
	public void MN_004() throws InterruptedException {
		
		frame.Menmodule1();
	}
	
	@Test
	public void MN_005() throws InterruptedException {
		
		frame.Tshirt();
	}
	@Test
	public void MN_006() throws InterruptedException {
		
		frame.Shirt();
	}
	
	@Test
	public void MN_007() throws InterruptedException {
		
		frame.sweatshirt();
	}
	
	@Test
	public void MN_008() throws InterruptedException {
		
		frame.sweater();;
	}
	
	@Test
	public void MN_009() throws InterruptedException {
		
		frame.jackets();
	}
	
	@Test
	public void MN_010() throws InterruptedException {
		
		frame.blazerscoats();
	}
	
	@Test
	public void MN_011() throws InterruptedException {
		
		frame.kurtaskurtasets();
	}
	
	@Test
	public void MN_012() throws InterruptedException {
		
		frame.sherwanis();
	}
	
	@Test
	public void MN_013() throws InterruptedException {
		
		frame.nehrujakets();
	}
	
	@Test
	public void MN_014() throws InterruptedException {
		
		frame.dhotis();
	}
	
	@Test
	public void MN_015() throws InterruptedException {
		
		frame.jeans();
	}
}
