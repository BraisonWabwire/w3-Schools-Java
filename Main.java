public class Main {

    static int factorial(int n){
        if (n>1){
            return n * factorial(n-1);
        }
        else{
            return 1;
        }
    }
    public static void main(String[] args) {

        int result = factorial(0);
        System.out.println(result);
    }
}