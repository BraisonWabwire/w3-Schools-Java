// String methods
// 1. To upper case
// 2. To lower case
// 3. Length of the string
// 4. Finding a character in the string

public class Main{
    public static void main(String[] args){
        String str = "Hello Braison welcome to Java Programming";
        System.out.println("Original String: "+ str);

        // To upper case
        String upperStr= str.toUpperCase();
        System.out.println("Upper Case: "+ upperStr);

        // To lower case
        String lowerStr= str.toLowerCase();
        System.out.println("Lower Case: "+ lowerStr);

        // Length of the string
        int length = str.length();
        System.out.println("Length of the string: "+ length);

        // Finding a character in the string using indexOf
        System.out.println("Index of 'Braison': "+ str.indexOf("Braison"));

        // Using charAt to find a character at a specific index
        System.out.println("Character at index 6: "+ str.charAt(6));
    }
}