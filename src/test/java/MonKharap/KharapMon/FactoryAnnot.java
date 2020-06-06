package MonKharap.KharapMon;

import org.testng.annotations.Test;

public class FactoryAnnot {

	public int a;
	
	public FactoryAnnot(int a) {
		this.a=a;
	}
	
	@Test
	public void one() {
		System.out.println("Test 1>> " + a);
	}
	@Test
	public void two() {
		System.out.println("Test 2>> " + a);
	}
	@Test
	public void three() {
		System.out.println("Test 3>> " + a);
	}
	
}//we have to create one runner class
