import java.util.Scanner;

public class MenuDisplay {

    public static void main(String[] args) {
        Scanner myscan = new Scanner(System.in);
        String choice;
        System.out.println("1-Sum of odd numbered indexes in given array");
        System.out.println("2-Sum of even numbered indexes in given array");
        System.out.println("3-Finds the avarage of the array");
        System.out.println("4-Finds the avarage and each ellemets differ from the avarage");
        System.out.println("5-Find minimum value in the array");
        System.out.println("6-Find the maximum value in the array");
        System.out.println("7-Exit");
        System.out.print("Enter your choice: ");
        choice=myscan.nextLine();
        int arr[]=new int[8];

        while(!choice.equals("Exit")&& !choice.equals("7")){
            if(choice.equals("1")){
                SumOddEven.sumOfOddIndexes(arr);
            }
            else if(choice.equals("2")){
                SumOddEven.sumOfEvenIndexes(arr);
            }
            else if (choice.equals("3")){
                Avarage.findAvarage(arr);
            }
            else if(choice.equals("4")){
                int av=Avarage.findAvarage(arr);
                Avarage.differFromAvarage(av, arr);
            }
            else if(choice.equals("5")){
                MinMaxFinder.MinFinder(arr);
            }
            else if(choice.equals("6")){
                MinMaxFinder.MaxFinder(arr);
            }
             
            System.out.println("1-Sum of odd numbered indexes in given array");
            System.out.println("2-Sum of even numbered indexes in given array");
            System.out.println("3-Finds the avarage of the array");
            System.out.println("4-Finds the avarage and each ellemets differ from the avarage");
            System.out.println("5-Find minimum value in the array");
            System.out.println("6-Find the maximum value in the array");
            System.out.println("7-Exit");
            System.out.print("Enter your choice: ");
            choice=myscan.nextLine();
            System.out.println();

        }
        if(choice.equals("7")){
            System.out.println("Kooooolaay gelsiinn");
        }
        
    }
}