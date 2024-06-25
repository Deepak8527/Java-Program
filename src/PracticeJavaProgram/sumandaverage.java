package PracticeJavaProgram;
import java.util.Scanner;
public class sumandaverage {
 
	    public static void main(String[] args) {
	       
	        System.out.println("Welcome Array sum and average\n");
	        int[] numArray = inputArray();
	        long sum = sum(numArray);
	        int avg = average(numArray);
	        System.out.println("sum of the number is: " + sum);
	        System.out.println("average of the number is: "+ avg);
	    }
	     public static int[] inputArray(){
	         Scanner input = new Scanner(System.in);
	        System.out.print("please enter the number the element: ");
	        int size = input.nextInt();
	        int []nums = new int[size];
	        int i = 0;
	        while (i< size) {
	            System.out.print("please enter the element no: " + (i+1)+ ": ");
	            nums[i] = input.nextInt();
	            i++;
	        }
	        return nums;
	    }
	    
	    public static long sum(int[] numArray){
	        long sum = 0;
	        int i = 1;
	        while (i < numArray.length) {
	            sum +=  numArray[i];
	        }
	        i++;
	        return sum;
	    }
	    public static int average(int[] numArray){
	    	
	        long sum = sum(numArray);
	        return (int)(sum /numArray.length);
	    }
	}


