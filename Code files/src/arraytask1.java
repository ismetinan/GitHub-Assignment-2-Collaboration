

import java.util.Random;



public class arraytask1 {

    
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