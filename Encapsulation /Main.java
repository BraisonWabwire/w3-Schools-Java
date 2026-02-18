public class Main {

      public static class Person{
          private String name;

          // Getter
          public String getName(){
                 return name;
          }

          // Setter
          public void setName(String newName){
               this.name = newName;
          }
      }


      public static void main(String[] args){
          Person myObj = new Person();
          myObj.setName("Braison");
          System.out.println(myObj.getName());
      }
}