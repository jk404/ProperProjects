
// Java SE compiler compliance level 1.7 required
// Practice of nested loops, if else, Scanner and CRAZE ;)

import java.util.Scanner;

public class MySeries 
{
    static int count=0;
    
    public static void main(String[] args) 
    {
        System.err.println("\tWelcome to JK's Series!!\n\n");
        startThis();
    }
    
    @SuppressWarnings("unused")
	public static void startThis()
    {
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Enter Starting number of JK's Series: ");
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
        System.out.println("\nJK's Series for numbers between " + Start + " and " + End + ": \n");
        doThis(Start, End);
        scan.close();
    }
    
    public static void doThis(int start, int end)
    {
        int seriesNumCount=0;
    	
    	OuterLoop:
        for ( int i = start; i<=end;)
        {
            System.out.print(i + ",");
            i++;
            seriesNumCount++;
            for(int x = start; x<i;)
            {
                if (i > end)
                    {
                        break OuterLoop;
                    }
                System.out.print(x + ",");
                x++;
                seriesNumCount++;
            }
        }
        System.out.println("\n\n--- JK's Series for numbers between " + start + " and " + end 
        		+ " ---\n--- Total Numbers in Series: " + seriesNumCount + " ---");
    }
}
