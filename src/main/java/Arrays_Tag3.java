import java.util.Arrays;

public class Arrays_Tag3 {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //1
        for (int n : num) {
            System.out.println(n);
        }

        //2
        int sum = 0;
        for (int i = 0; i <= num.length - 1; i++) {
            sum += num[i];
        }
        System.out.println("Summe: " + sum);

        //3
        int max = 0;
        for(int i : num) {
            if(i > max) {
                max = i;
            }
        }
        System.out.println("Max: " + max);

        //4
        int[] num2 = {11,12,13,14,15,16,17,18,19,20};

        //5
        int[] arrSum = new int[num.length];
        for (int i = 0; i < arrSum.length; i++) {
            arrSum[i] = num[i] + num2[i];
        }
        System.out.println("Summe: " + Arrays.toString(arrSum));
    }
}
