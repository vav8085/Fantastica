package com.vav.Reference.USanDieg_DsAlgoSpecialization.Algo_Toolbox.Week2.Code;

public class FibonacciLastDigit {
    private static int getFibonacciLastDigitNaive(int n) {
        if (n <= 1)
            return n;

        int previous = 0;
        int current  = 1;

        for (int i = 0; i < n - 1; ++i) {
            int tmp_previous = previous;
            previous = current%10;
            current = (tmp_previous + current)%10;
        }

        return current;
    }

    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
       // int n = scanner.nextInt();
        int c = getFibonacciLastDigitNaive(3);
        System.out.println(c);
    }
}
