package Exam.exam;

import java.util.Arrays;
import java.util.Random;

public class App 
{
	 public static void main( String[] args )
	    {
	    	Random random  = new Random();
	    	int [] Array = new int[100000]; 
	    	for(int i =0;i<Array.length;i++)
	        {     
	          Array[i] = random.nextInt(100000);
	         // System.out.println( Array[i]);
	        }
	    	Arrays.sort(Array);
	    	for (int j =0;j<Array.length;j++)
	    	{
	    		 System.out.println( Array[j]);
	    	}
	    }
	    
}
