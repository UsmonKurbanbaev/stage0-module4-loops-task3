package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int num1 = 0, num2 = 1, num3;
        System.out.println(num1);
        System.out.println(num2);
        for(int i = 2; i < lastFibonacci; i++) {
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            System.out.println(num3);
        }
    }
}
