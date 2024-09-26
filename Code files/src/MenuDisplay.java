import java.util.Arrays;
import java.util.Scanner;





public class MenuDisplay {

    public static void main(String[] args) {
        Scanner myscan = new Scanner(System.in);
        String choice;
        System.out.print("Enter requested size of array: ");
        int size = myscan.nextInt();
        System.out.println("1-Sum of odd numbered indexes in given array");
        System.out.println("2-Sum of even numbered indexes in given array");
        System.out.println("3-Finds the avarage of the array");
        System.out.println("4-Finds the avarage and each ellemets differ from the avarage");
        System.out.println("5-Find minimum value in the array");
        System.out.println("6-Find the maximum value in the array");
        System.out.println("7-Exit");
        System.out.print("Enter your choice: ");
        choice=myscan.next();
        System.out.println();
        int[] arr =new int[size];
        arr =  arraytask1.createRandomArray(size);
        while(!choice.equals("Exit")&& !choice.equals("7")){
            if(choice.equals("1")){
                int sum = SumOddEven.sumOfOddIndexes(arr);
                System.out.println("Sum of odd indexed numbers: " + sum );
            }
            else if(choice.equals("2")){
                int sum1 = SumOddEven.sumOfEvenIndexes(arr);
                System.out.println("Sum of even indexed integers: " + sum1);
            }
            else if (choice.equals("3")){
               int ava= Avarage.findAvarage(arr);
                System.out.println("Avarage of your array is : " + ava );
            }
            else if(choice.equals("4")){
                int av=Avarage.findAvarage(arr);
                int[] diff = new int[size];
                diff=Avarage.differFromAvarage(av, arr);
                System.out.println("Each elements differ from the avarage: " + Arrays.toString(diff) );
            }
            else if(choice.equals("5")){
                int min=MinMaxFinder.MinFinder(arr);
                System.out.println("Min element of your array is: " + min );
            }
            else if(choice.equals("6")){
                int max=MinMaxFinder.MaxFinder(arr);
                System.out.println("Max element of your array is: " + max);
            
            }
            System.out.println();
             
            System.out.println("1-Sum of odd numbered indexes in given array");
            System.out.println("2-Sum of even numbered indexes in given array");
            System.out.println("3-Finds the avarage of the array");
            System.out.println("4-Finds the avarage and each ellemets differ from the avarage");
            System.out.println("5-Find minimum value in the array");
            System.out.println("6-Find the maximum value in the array");
            System.out.println("7-Exit");
            System.out.print("Enter your choice: ");
            choice=myscan.next();
            System.out.println();

        }
        if(choice.equals("7")){
            System.out.println("Kooooolaay gelsiinn");
        }
        myscan.close();
        
    }
}