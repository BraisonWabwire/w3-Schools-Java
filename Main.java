// Java Methods: Parameters and Arguments
public class Main {

     public static void myMethod(int age){
        if(age < 18){
            System.out.println("You are a minor.");
        } else {
            System.out.println("You are an adult.");
        }
     }

     public static void main (String[] args){
        myMethod(15); 
        myMethod(25); 
     }
}