import java.util.Scanner;

public class MenuDisplay {

    public static void main(String[] args) {
        Scanner myscan = new Scanner(System.in);
        String choice;
        System.out.println("1-Sum of odd numbered indexes in given array");
        System.out.println("2-Sum of even numbered indexes in given array");
        System.out.println("3-Finds the avarage of the array");
        System.out.println("4-Find minimum value in the array");
        System.out.println("5-Find the maximum value in the array");
        System.out.println("6-Exit");
        System.out.print("Enter your choice: ");
        choice=myscan.nextLine();

        while(!choice.equals("Exit")&& !choice.equals("6")){
            
            System.out.println("1-Sum of odd numbered indexes in given array");
            System.out.println("2-Sum of even numbered indexes in given array");
            System.out.println("3-Finds the avarage of the array");
            System.out.println("4-Find minimum value in the array");
            System.out.println("5-Find the maximum value in the array");
            System.out.println("6-Exit");
            System.out.print("Enter your choice: ");
            choice=myscan.nextLine();
            System.out.println();

        }
        
    }
}