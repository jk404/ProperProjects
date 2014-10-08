
// Java SE compiler compliance level 1.7 required
// Practice of nested loops, if else, Scanner and CRAZE ;)

import java.util.Scanner;

@SuppressWarnings("unused")
public class MySeries 
{
    static int count=0;
    static boolean rerun=true;
    
    static Scanner scan;
    
    public static void main(String[] args) 
    {
    	System.err.println("\tWelcome to JK's Series!!\n\n");
    	do
        {
        	startThis();
        	System.out.println("\n\nDo you want to run it again?");
        	scan = new Scanner (System.in);
        	String RERUN = scan.nextLine();
        	if(RERUN.equalsIgnoreCase("y"))
        	{
        		rerun=true;
        	}
        	else 
        	{
        		rerun=false;
        		System.err.println("Thankyou for using JK's Series!!");
        		scan.close();
        	}
        	
        } while (rerun);
        
    }
    

	public static void startThis()
    {
        scan = new Scanner (System.in);
        
        System.out.println("\nEnter Starting number of JK's Series: ");
        int Start = scan.nextInt();
        
        System.out.println("\nEnter Ending number of JK's Series: ");
        int End = scan.nextInt();
        
        System.out.println();
        
        // temp string to fix so called int Scanner 'bug' in java
		String temp = scan.nextLine();
        
        if(Start>End)
            {
                count++;
                if (count >=3)
                {
                    System.err.println("Misuse Detected! Exiting!"); 
                    System.exit(0);
                }
                System.err.println("Please enter values correctly!\n\n");
                startThis();
            }
        
        doThis(Start, End);
        
    }
    
    public static void doThis(int start, int end)
    {
        int seriesNumCount=0;
        int inputRange=start;
        int inputRangeCount=(end-start)+1;
        String seperator=",";
    	
        System.out.print("\nThe range of numbers is: ");
        
        while (inputRange <= end)
        {
        	if (inputRange == end)
        	{
        		System.out.println(inputRange);
        		break;
        	}
        	System.out.print(inputRange + ",");
        	inputRange++;
        }
        
        System.out.println("\nTotal numbers in range is: " + inputRangeCount);
        
        System.out.println("\nJK's Series for numbers from " + start + " to " + end + ": \n");
        
        OuterLoop:
        for ( int i = start; i<=end;)
        {
        	if (i==end)
            {
            	seperator="";
            }
        	System.out.print(i + seperator);
            i++;
            seriesNumCount++;
            InnerLoop:
            for(int x = start; x<i;)
            {
               if (i > end)
               {
            	   break OuterLoop;
               }
               System.out.print(x + seperator);
               x++;
               seriesNumCount++;
            }
        }
        System.out.println("\n\n--- JK's Series for numbers from " + start + " to " + end 
        					+ " ---\n--- Total Numbers in Series: " + seriesNumCount + " ---");
    }
}
