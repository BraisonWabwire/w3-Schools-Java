// Public and private access modifiers in Java
public class Main {
     static class Person{
          String name = "Braison";
          int age = 22;

          void displayInfo() {
               System.out.println("Name: " + name);
               System.out.println("Age: " + age);
          }

     }

     public static void main(String[] args) {

          Person person1 = new Person(); // create object
          person1.displayInfo();
     }
}