package sorting;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

/**
 * Series where the next number is the sum of the 2 previous numbers
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
 */
public class Fibonacci {

    private static final Logger logger = LogManager.getLogger(Fibonacci.class);
    private final Map<Integer, Integer> alreadyCalculated = new HashMap<>();
    int iterationsNormalRecursion = 0;
    int iterationsDynamicRecursion1 = 0;
    int iterationsDynamicRecursion2 = 0;

    int fibonacciRecursion(int n) {
        logger.trace("Calculating for {}", n);
        iterationsNormalRecursion++;
        if (n <= 1) {
            return n;

        }
        return fibonacciRecursion(n - 2) + fibonacciRecursion(n - 1);
    }

    int fibonacciDynamic(int n) {
        logger.trace("Calculating for {}", n);
        iterationsDynamicRecursion1++;
        if (n <= 1) {
            return n;
        }

        int secondLast = alreadyCalculated.get(n - 2) != null ? alreadyCalculated.get(n - 2) : fibonacciDynamic(n - 2);
        alreadyCalculated.put(n - 2, secondLast);
        int previous = fibonacciDynamic(n - 1);
        alreadyCalculated.put(n - 1, previous);
        return secondLast + previous;
    }

    int fibonacciDynamic2(int n) {
        logger.trace("Calculating for {}", n);

        int[] foundFibonaccis = new int[n + 2];

        foundFibonaccis[0] = 0;
        foundFibonaccis[1] = 1;

        for (int i = 2; i <= n; i++) {
            iterationsDynamicRecursion2++;
            foundFibonaccis[i] = foundFibonaccis[i - 1] + foundFibonaccis[i - 2];
        }
        return foundFibonaccis[n];
    }
}
