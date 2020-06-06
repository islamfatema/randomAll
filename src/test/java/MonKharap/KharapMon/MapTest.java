package MonKharap.KharapMon;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class MapTest {
	@Test
	public void test() {
	Map<String,String> gfg = new HashMap<String,String>(); 
    
    // enter name/url pair 
    gfg.put("GFG", "geeksforgeeks.org"); 
    gfg.put("Practice", "practice.geeksforgeeks.org"); 
    gfg.put("Code", "code.geeksforgeeks.org"); 
    gfg.put("Quiz", "quiz.geeksforgeeks.org"); 
      
    // using for-each loop for iteration over Map.entrySet() 
    for (Map.Entry<String,String> entry : gfg.entrySet())  
        System.out.println("Key = " + entry.getKey() + 
                         ", Value = " + entry.getValue()); 
	}
    
    
 @Test
 public void test1() {
	 Map<String,String>in=new HashMap<String,String>();
	 in.put("ame", "khabo");
	 in.put("Ki", "khabi");
	 for(Map.Entry<String, String>en:in.entrySet()) {
		 
	 }
			
 }
}
