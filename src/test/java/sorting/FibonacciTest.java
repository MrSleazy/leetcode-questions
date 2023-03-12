package sorting;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.assertj.core.api.Assertions.assertThat;

class FibonacciTest {

    private final static Logger logger = LogManager.getLogger(FibonacciTest.class);

    private Fibonacci fibonacci;

    @BeforeEach
    void setUp() {
        fibonacci = new Fibonacci();
    }

    @Test
    void testFibonacci() {
        assertThat(fibonacci.fibonacciRecursion(0)).isEqualTo(0);
        assertThat(fibonacci.fibonacciRecursion(1)).isEqualTo(1);
        assertThat(fibonacci.fibonacciRecursion(5)).isEqualTo(5);
        assertThat(fibonacci.fibonacciRecursion(9)).isEqualTo(34);
        assertThat(fibonacci.fibonacciRecursion(20)).isEqualTo(6765);

        logger.info("Total iterationsNormalRecursion: " + fibonacci.iterationsNormalRecursion);
    }

    @Test
    void testFibonacciDynamic() {
        assertThat(fibonacci.fibonacciDynamic(0)).isEqualTo(0);
        assertThat(fibonacci.fibonacciDynamic(1)).isEqualTo(1);
        assertThat(fibonacci.fibonacciDynamic(5)).isEqualTo(5);
        assertThat(fibonacci.fibonacciDynamic(9)).isEqualTo(34);
        assertThat(fibonacci.fibonacciDynamic(20)).isEqualTo(6765);

        logger.info("Total iterationsDynamicRecursion1: " + fibonacci.iterationsDynamicRecursion1);
    }

    @Test
    void testFibonacciDynamic2() {
        assertThat(fibonacci.fibonacciDynamic2(0)).isEqualTo(0);
        assertThat(fibonacci.fibonacciDynamic2(1)).isEqualTo(1);
        assertThat(fibonacci.fibonacciDynamic2(5)).isEqualTo(5);
        assertThat(fibonacci.fibonacciDynamic2(9)).isEqualTo(34);
        assertThat(fibonacci.fibonacciDynamic2(20)).isEqualTo(6765);

        logger.info("Total iterationsDynamicRecursion2: " + fibonacci.iterationsDynamicRecursion2);
    }

    @Test
    void testFibonacciDynamic3() {
        assertThat(fibonacci.fibonacciDynamic3(0, new HashMap<>())).isEqualTo(0);
        assertThat(fibonacci.fibonacciDynamic3(1, new HashMap<>())).isEqualTo(1);
        assertThat(fibonacci.fibonacciDynamic3(5, new HashMap<>())).isEqualTo(5);
        assertThat(fibonacci.fibonacciDynamic3(9, new HashMap<>())).isEqualTo(34);
        assertThat(fibonacci.fibonacciDynamic3(20, new HashMap<>())).isEqualTo(6765);

        logger.info("Total iterationsDynamicRecursion3: " + fibonacci.iterationsDynamicRecursion3);
    }
}