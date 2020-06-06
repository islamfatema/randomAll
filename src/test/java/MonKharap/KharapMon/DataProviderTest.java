package MonKharap.KharapMon;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
  @DataProvider
  public Object [] [] DP(){
	  Object [] [] a= {{1},{2},{3},{4},{5}};
	  return a;
  }
  @Test(dataProvider="DP")
  public void one(Object a) {
	 System.out.println("Test 1" ); 
  }
}
