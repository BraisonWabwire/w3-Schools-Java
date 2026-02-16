// Java multidimentional arrays
public class Main {
    public static void main(String[] args) {
       int [][] numbers = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9},
       };

        System.out.println(numbers[0][0]);
        System.out.println(numbers[0][1]);


        // Looping through a multidimentional array
        for (int row=0; row < numbers.length; row++){
            for (int col=0; col < numbers[row].length; col++){
                 System.out.println("myNumbers[" + row + "][" + col + "] = " + numbers[row][col]);
            }
        }
    }
}