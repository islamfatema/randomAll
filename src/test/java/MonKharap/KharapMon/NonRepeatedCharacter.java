package MonKharap.KharapMon;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import org.testng.annotations.Test;

public class NonRepeatedCharacter {
	
//	//aabcddefch
//	@Test
//  public void testNonRepeat() {
//		
//	  System.out.println("Input a string");
//	  //take a  input
//	  Scanner scan =new Scanner(System.in);
//	  //assign value into string
//	  String str=scan.nextLine();
//	//  length of a string
//	  int length=str.length();
//	  
//	    //using hashmap
//	  HashMap <Character,Integer> charCount=new HashMap <Character,Integer>();
//	  
//	  Character ch;
//	  
//      for (int i=0;i<length;i++) {
//		ch=str.charAt(i);
//	//if character is already exist then increment it's count by 1	
//		
//		if(charCount.containsKey(ch)) {
//			charCount.put(ch, charCount.get(ch)+1);
//		}
//		else {
////if no value stored for a character then set it to 1			
//			charCount.put(ch, 1);
//		}
//	}
//  for (int j = 0; j < length; j++) {
//	ch = str.charAt(j);
//	if(charCount.get(ch)==1) {
//		System.out.println("First non repeated character is "+ ch);
//	 break;
//	}
//	
//}
//  }
	@Test
	public void vua() {
		String str="aabbccddeffg";
		for(int i=0;i<str.length();i++) {
			if(str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))) {
			System.out.println(str.charAt(i));	
			break;
			}
		}
	}
	//without collections
	//aabcddefch
		@Test
	  public void testNonRepeat2() {
		String str="aabcddefch";
		for (int i=0;i<str.length();i++) {
			//if(str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))) {
			if(str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))) {
				
				System.out.println(str.charAt(i));
				break;
			}
		}
		}
	
}
