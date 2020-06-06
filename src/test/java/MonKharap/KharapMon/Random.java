package MonKharap.KharapMon;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

import org.testng.annotations.Test;

public class Random {
	//Reverse String
  @Test
  public void danial() {
	 String s="GEL" ;
	 char [] reverse=s.toCharArray();
	 for(int i=reverse.length-1;i>=0;i--) {
		 System.out.println(reverse[i]);
	 }
  }
	 @Test
	  public void danial2() {
		 String s="Selenium" ;
		 String reverse=new StringBuffer(s).reverse().toString();
		System.out.println(reverse);
		 
  }
	 //Print even number
	 @Test
	  public void danial3() {
		 int number=100 ;
		 
		 for(int i=1;i<=number;i++) {
			 if( i % 2 == 0){
			 System.out.print(" " + i + "");
		 }
		 }	 
			 
			
	 }
	 //Print Odd number
	 @Test
	  public void danial4() {
		 int number=100 ;
		 
		 for(int i=1;i<=number;i++) {
			 if( i % 2 != 0){
			 System.out.print(" " + i + "");
		 }
		 }
}

	 //Reverse Int array
	// Given input array 
	 @Test
	 
	 public void reverse() {
		 int[] arr = { 10,11,12,13,14,15};
		  System.out.println("Original array : "+Arrays.toString(arr));  
		   for(int i = 0; i < arr.length / 2; i++)
		  {
		    int temp = arr[i];
		    arr[i] = arr[arr.length - i - 1];
		    arr[arr.length - i - 1] = temp;
		  }
		    System.out.println("Reverse array : "+Arrays.toString(arr));
		 }
	 
 @Test

	 public void highestNum() {
	 int arr[] = {10, 324, 45, 90, 9808}; 
     int max = Arrays.stream(arr).max().getAsInt(); 
     System.out.println("Largest in given array is " +max); 
 
 }
	 }
	
