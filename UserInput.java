package myLibrary.easy.userInput;


import java.util.Scanner;


public class UserInput 
{
    
    public byte getByte(String whatToAskFromUser)
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.print(whatToAskFromUser);
        byte temp = scan.nextByte();
        return temp;
    }
    
    public short getShort(String whatToAskFromUser)
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.print(whatToAskFromUser);
        short temp = scan.nextShort();
        return temp;
    }
    
    public int getInt(String whatToAskFromUser)
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.print(whatToAskFromUser);
        int temp = scan.nextInt();
        return temp;
    }
    
    public long getLong(String whatToAskFromUser)
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.print(whatToAskFromUser);
        long temp = scan.nextLong();
        return temp;
    }
    
    public float getFloat(String whatToAskFromUser)
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.print(whatToAskFromUser);
        float temp = scan.nextFloat();
        return temp;
    }
    
    public double getDouble(String whatToAskFromUser)
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.print(whatToAskFromUser);
        double temp = scan.nextDouble();
        return temp;
    }
    
    public boolean getBoolean(String whatToAskFromUser)
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.print(whatToAskFromUser);
        boolean temp = scan.nextBoolean();
        return temp;
    }
    
    public char getChar(String whatToAskFromUser)
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.print(whatToAskFromUser);
        char temp = scan.nextLine().trim().charAt(0);
        return temp;
    }
    
    public String getString(String whatToAskFromUser)
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.print(whatToAskFromUser);
        String temp = scan.nextLine();
        return temp;
    }
    
}
