public class Tag2 {

    public static void main(String[] args) {
        System.out.println("add: " + add(6,2));
        System.out.println("add(double): " + add(6.5,3.4));
        System.out.println("add(float): " + add(6.5f,3.3f));
        System.out.println("subtract: " + subtract(5,3));
        System.out.println("makePositive: " + makePositive(-4));

        int num1 = 10, num2 = 20;
        if (num1 > num2) {
            subtract(num1, num2);
        } else {
            add(num1, num2);
        }

        System.out.println("is even?(512): " + isEven(512));
        System.out.println("is even?(13): " + isEven(13));
        System.out.println("is racecar a palindrome?: " + isPalindrome("racecar"));
        System.out.println("is hello a palindrome?: " + isPalindrome("hello"));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static float add(float a, float b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int makePositive(int a) {
        return Math.abs(a);
    }

    public static int isEven(int a) {
        if (a % 2 == 0){
            return a;
        } else {
            return a * 2;
        }
    }

    public static boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }

        // Clean up String -> to lowercase and remove non alphanumeric values
        String cleanString = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        //index
        int left = 0;
        int right = cleanString.length() - 1;

        //Loop through from front and back and compare chars
        while (left < right) {
            if (cleanString.charAt(left) != cleanString.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
