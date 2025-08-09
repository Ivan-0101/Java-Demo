package Exercise_3_Package;

public class Skipping_Multiples_Of_3 {
    public static void main (String[] args){
        int[] array = {12, 283, 48, 208, 51, 9, 77, 645826040};
        for (int i=0; i<=(array.length) - 1; i++){
            if (array[i] % 3 == 0){
                continue;
            }
            System.out.println(array[i]);
        }
    }
}
