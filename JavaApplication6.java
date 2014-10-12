
package javaapplication6;

public class JavaApplication6 
{

    public static void main(String[] args) 
    {
        String s1 = "this is the s1 string";
        String S2 = "THIS IS THE S2 STRING";
        String s3 = s1+" "+S2+" making string s3";
        
        System.out.println(s1);
        System.out.println(S2);
        System.out.println("\n");
       
        /*
        * codepointAt() int
        * Returns the character (Unicode code point) at the specified index.
        * The index refers to char values (Unicode code units) and ranges from 0 to String.length()- 1.
        */
        System.out.println("codePointAt index 9 of string s1 is: "+s1.codePointAt(9));
        
        
        /*
        * codepointBefore() int
        * Returns the character (Unicode code point) before the specified index.
        * The index refers to char values (Unicode code units) and ranges from 1 to length.
        */
        System.out.println("codePointBefore index 9 of string s1 is: " + s1.codePointBefore(9));
        
        
        /*
        * codepointCount() int
        * Returns the number of Unicode code points in the specified text range of this String.
        * The text range begins at the specified beginIndex and extends to the char at index endIndex - 1.
        * Thus the length (in chars) of the text range is endIndex-beginIndex.
        */
        System.out.println("codePointCount from index 5 to 7 of string s1 is: "+s1.codePointCount(5, 7));
        
        
        /*
        * startsWith() boolean
        * Tests if this string starts with the specified prefix.
        * Also can skip number of indexes specified from the start.
        */
        System.out.println("string s1 startsWith t: " + s1.startsWith("t"));
        System.out.println("string s1 startsWith his (starting index 1): " + s1.startsWith("his",1));
        
        
        /*
        * endsWith() boolean
        * Tests if this string ends with the specified prefix.
        */
        System.out.println("string s1 endsWith g: " + s1.endsWith("g"));
        System.out.println("string s1 endsWith string: " + s1.endsWith("string"));
        
        
        /*
        * toUpperCase() String
        * Converts all of the characters in this String to upper case using the rules of the default locale.
        * This method is equivalent to toUpperCase(Locale.getDefault()).
        */
        System.out.println("string s1 toUpperCase: " + s1.toUpperCase());
        
        
        /*
        * toLowerCase() String
        * Converts all of the characters in this String to lower case using the rules of the default locale.
        * This method is equivalent to toLowerCase(Locale.getDefault()).
        */
        System.out.println("string S2 toLowerCase: " + S2.toLowerCase());
        
        
        /*
        * valueOf() String
        * This method has followings variants, which depend on the passed parameters.
        * This method returns the string representation of the passed argument.
        *
        * valueOf(boolean b): Returns the string representation of the boolean argument.
        * valueOf(char c): Returns the string representation of the char argument.
        * valueOf(char[] data): Returns the string representation of the char array argument.
        * valueOf(char[] data, int offset, int count): Returns the string representation of a specific subarray of the char array argument.
        * valueOf(double d): Returns the string representation of the double argument.
        * valueOf(float f): Returns the string representation of the float argument.
        * valueOf(int i): Returns the string representation of the int argument.
        * valueOf(long l): Returns the string representation of the long argument.
        * valueOf(Object obj): Returns the string representation of the Object argument.
        */
        boolean isTrue=s1.equals(S2);
        System.out.println("Is string s1 equal to string S2: " + String.valueOf(isTrue));
        isTrue=s1.equalsIgnoreCase(S2);
        System.out.println("Is string s1 equal to string S2(if not case sensitive): " + String.valueOf(isTrue));
        char[] myArray = s3.toCharArray();
        System.out.println("char array of s3 to string: " + String.valueOf(myArray));
        
        
        /*
        * toCharArray() char[]
        * Converts the string to a new character array.
        */
        char[] c1 = s3.toCharArray();
        System.out.println("string s3 to char array:");
        
        for (char index : c1)
        {
            System.out.print(index + ", ");
        }
        System.out.println();
        
    }
    
}
