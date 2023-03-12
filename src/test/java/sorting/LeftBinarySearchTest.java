package sorting;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static sorting.LeftBinarySearch.*;

class LeftBinarySearchTest {

    @Test
    void testGetTargetIndexFromBinary() {
        int[] primes = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};

        assertThat(primes[getTargetIndexFromBinarySearch(primes, 13)]).isEqualTo(13);

        assertThat(primes[getTargetIndexFromBinarySearch(primes, 2)]).isEqualTo(2);
        assertThat(primes[getTargetIndexFromBinarySearch(primes, 97)]).isEqualTo(97);

        //not found
        assertThat(primes[getTargetIndexFromBinarySearch(primes, 18)]).isNotEqualTo(18);

        assertThat(getTargetIndexFromBinarySearch(primes, -1)).isEqualTo(0);
        assertThat(getTargetIndexFromBinarySearch(primes, 10000)).isEqualTo(primes.length);
    }

    @Test
    void testCustomBinarySearch() {
        int[] primes = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};

        assertThat(primes[customBinarySearch(primes, 13)]).isEqualTo(13);

        assertThat(primes[customBinarySearch(primes, 2)]).isEqualTo(2);

        //not found
        assertThat(primes[customBinarySearch(primes, 18)]).isNotEqualTo(18);

        assertThat(customBinarySearch(primes, -1)).isEqualTo(0);
        assertThat(customBinarySearch(primes, 10000)).isEqualTo(primes.length);
    }

    @Test
    void testJavaBinarySearch() {
        int[] primes = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};

        assertThat(primes[Arrays.binarySearch(primes, 13)]).isEqualTo(13);
        assertThat(Arrays.binarySearch(primes, 13)).isEqualTo(5);

        assertThat(Arrays.binarySearch(primes, 2)).isEqualTo(0);

        //not found
        assertThat(Arrays.binarySearch(primes, 18)).isNegative();
        assertThat(Arrays.binarySearch(primes, -1)).isNegative();
        assertThat(Arrays.binarySearch(primes, 10000)).isNegative();
    }

}