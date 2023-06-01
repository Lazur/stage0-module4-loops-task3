package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        long sum = 0;
        long number = 9;

        for (int i = 1; i <= lengthOfLastNumber; i++) {
            sum += number;
            number = number * 10 + 9;
        }
        System.out.println(sum);
    }
}
