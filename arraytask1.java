import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class arraytask1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int size = scan.nextInt();
        System.out.println(Arrays.toString(createRandomArray(size)));
    }
    public static int[] createRandomArray (int num)
    {
        Random random = new Random();
        int[] arr = new int[num];
        for(int i=0; i<num; i++){
            arr[i] = random.nextInt(0,100);

        }

        return arr;
    }
    
}