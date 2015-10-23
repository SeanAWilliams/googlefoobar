package level1;

/**
 * Created by william on 10/23/2015.
 */

public class Answer {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int count = sc.nextInt();
//        System.out.println(sumMultiple(999));
        System.out.println(answer(1235));

    }

    public static int answer(int x) {
        if (x < 10) {
            return x;
        } else {
            String number = String.valueOf(x);
            char[] digits = number.toCharArray();
            int digitCount = 0;
            for (int i = 0; i < digits.length; i++)
                digitCount += Character.getNumericValue(digits[i]);
            return answer(digitCount);
            // Your code goes here.
        }
    }
}
