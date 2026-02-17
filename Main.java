// Recursion to add numbers from 5 to 10
public class Main{
    public static int sum(int start, int end){
        if(end > start){
            return end +sum(start, end -1);
        }
        else{
            return end;
        }
    }
    public static void main(String[] args){
        int result = sum(5, 10);
        System.out.println(result);
    }
}