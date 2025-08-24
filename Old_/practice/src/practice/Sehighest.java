package practice;

public class Sehighest {
    public static void main(String[] args) {
        int[] numbers = {12, 45, 67, 89, 34, 89, 10};

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : numbers) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }

        System.out.println("Second highest: " + secondMax);
    }
}


