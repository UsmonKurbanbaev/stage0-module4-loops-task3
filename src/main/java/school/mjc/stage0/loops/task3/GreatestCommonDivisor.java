package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        if (first == 0) {
            System.out.println(second);
        } else if (second == 0) {
            System.out.println(first);
        } else {
            int i;
            if (first < second) {
                i = first;
            } else {
                i = second;
            }
            for (i = i; i >= 1; i--) {
                if (first % i == 0 && second % i == 0) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}