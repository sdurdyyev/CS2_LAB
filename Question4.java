import java.util.Scanner;

public class Question4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter between 1 and 5: ");
        int number = sc.nextInt();
        int square = number * number;
        System.out.println("Square of given number is: " + square);
    }
}
