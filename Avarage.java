public class Avarage {
    public static void main(String[] args) {
        
    }
    public static int findAvarage (int[] numbers){
        int avarage = 0;
        int count = 0;
        int sum = 0;
        for(int i: numbers){
            sum  += i;
            count++;
        }
        avarage = sum /count;
        return avarage;

    }
    public static int[] differFromAvarage(int avarage,int []numbers){
        int size ;
        int index =0;

        size = numbers.length;
        int[] differNum = new int[size];
        for(int i:numbers){
            differNum[index] = i-avarage;
            index++;
        }
        return differNum;

    }
}
/* Find the average of the array. Display how each element of the array differs from the average. For example, if the array is {2, 6, 9, 3, 5}, and the average is 5, 
then the differences from the average would be {-3, 1, 4, -2, 0}. */
