package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public static void printDigitsSum(int t){
        String numberString = String.valueOf(Math.abs(t));
        int sum = 0;
        for (int i = 0; i < numberString.length(); i++) {
            String digitChar = String.valueOf(numberString.charAt(i));
            int digit = Integer.parseInt(digitChar);
            sum += digit;
        }
        System.out.println(sum);
    }
}
