import java.util.Scanner;

public class NumCompare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double numOne;
        double numTwo;

        System.out.println("Write a number");
        if(scan.hasNextDouble()){
            numTwo = scan.nextDouble();
            System.out.println("Enter a second number");
            if(scan.hasNextDouble()){
                numOne = scan.nextDouble();
                if(numTwo > numOne){
                    System.out.println(numTwo + " is greater than " + numOne);
                } else if (numTwo < numOne){
                    System.out.println(numTwo + " is less than " + numOne);
                } else {
                    System.out.println(numTwo + " is equal to " + numOne);
                }
            } else {
                System.out.println("ENTER A NUMBER");
                System.exit(0);
            }
        } else {
            System.out.println("ENTER A NUMBER");
            System.exit(0);
        }
    }
}