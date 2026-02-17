// Java Methods: Parameters and Arguments
public class Main {

     public static void myMethod(String fname, int age){
        System.out.println("I just got executed by " + fname + " who is " + age + " years old!");
     }

     public static void main (String[] args){
        myMethod("Braison", 22);
        myMethod("Wabwire", 25);
        myMethod("Daniel", 30);
     }
}