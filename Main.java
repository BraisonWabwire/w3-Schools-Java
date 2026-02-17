// Constructor methods in java
public class Main {

     String name;
     String email;
     int age;


     // Constructor method
     public Main(String name, String email, int age){
          this.name = name;
          this.email = email;
          this.age = age;
     }

     public static void main(String[] args){

          Main obj = new Main("Braison", "braison@example.com", 25);
          System.out.println(obj.name);
          System.out.println(obj.email);
          System.out.println(obj.age);

     }
}