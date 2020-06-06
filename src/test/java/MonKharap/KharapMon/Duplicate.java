package MonKharap.KharapMon;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import org.testng.annotations.Test;

public class Duplicate {

@Test
public void getDuplicate() {
	String names []= {"java","java","ruby","python","c++","ruby"};
	
	Set<String> store=new HashSet<String>();
	for(String name:names) {
		if(store.add(name)==false) {
			System.out.println("Duplicate element is " +name);
		}
	}
	
}
//    		@Test
//    		public void test1() {
// System.out.println("Enter String");
// Scanner scan=new Scanner(System.in);
// String str=scan.nextLine();
// int length=str.length();
// HashMap<Character,Integer>charCount= new HashMap<Character,Integer>();
// Character ch;
// for(int i=0;i<str.length();i++) {
//	 ch=str.charAt(i);
//	 if(charCount.containsKey(ch)) {
//		 charCount.put(ch, charCount.get(ch)+1);
//	 }
//	 else {
//		 charCount.put(ch, 1);
//	 }
// }
//for (int j = 0; j < str.length(); j++) {
//	ch=str.charAt(j);
//	if(charCount.get(ch)==1) {
//		System.out.println(ch);
//		break;
//	}
//}


}


	 

  
    		
    		
    	
    		
    
			
	
			


