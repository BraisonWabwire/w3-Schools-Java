// Real world example
public class Main {

     public static void main(String[] args){
        int dice = 1;
        while( dice <=6){
            if(dice == 6){
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }
            dice = dice + 1;
        }
     }
}