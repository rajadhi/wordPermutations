package java.com.rajadhi.code;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

class WordPermutationTest {

    @Test
    public void getPermutations_shouldReturn_allPermutationsForTwoLetters() {
        WordPermutation wordPermutation = new WordPermutation();
        Set<String> permutations = wordPermutation.getPermutations("Ab");

        Set<String> expected = new HashSet<>(asList("Ab", "AB"));
        assertEquals(expected, permutations);
    }

    @Test
    public void getPermutations_shouldReturn_allPermutationsForThreeLetters() {
        WordPermutation wordPermutation = new WordPermutation();
        Set<String> permutations = wordPermutation.getPermutations("abC");

        Set<String> expected = new HashSet<>(asList("AbC", "aBC", "ABC"));
        assertEquals(expected, permutations);
    }

    @Test
    public void getPermutations_shouldReturn_allPermutationsForFourLetters() {
        WordPermutation wordPermutation = new WordPermutation();
        Set<String> permutations = wordPermutation.getPermutations("AbcD");

        Set<String> expected = new HashSet<>(asList("AbcD", "ABcD", "AbCD", "ABCD"));
        assertEquals(expected, permutations);
    }
}