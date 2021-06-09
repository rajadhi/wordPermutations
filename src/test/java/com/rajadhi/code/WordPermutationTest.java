package com.rajadhi.code;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;


public class WordPermutationTest {

    @Test
    public void getPermutations_shouldReturn_allPermutationsForOneLetters() {
        WordPermutation wordPermutation = new WordPermutation();
        Set<String> permutations = wordPermutation.init("a");

        Set<String> expected = new HashSet<>(asList("a", "A"));
        assertEquals(expected, permutations);
    }

    @Test
    public void getPermutations_shouldReturn_allPermutationsForTwoLetters() {
        WordPermutation wordPermutation = new WordPermutation();
        Set<String> permutations = wordPermutation.init("Ab");

        Set<String> expected = new HashSet<>(asList("Ab", "AB"));
        assertEquals(expected, permutations);
    }

    @Test
    public void getPermutations_shouldReturn_allPermutationsForThreeLetters() {
        WordPermutation wordPermutation = new WordPermutation();
        Set<String> permutations = wordPermutation.init("abC");

        Set<String> expected = new HashSet<>(asList("abC", "AbC", "aBC", "ABC"));
        assertEquals(expected, permutations);
    }

    @Test
    public void getPermutations_shouldReturn_allPermutationsForFourLetters() {
        WordPermutation wordPermutation = new WordPermutation();
        Set<String> permutations = wordPermutation.init("AbcD");

        Set<String> expected = new HashSet<>(asList("AbcD", "ABcD", "AbCD", "ABCD"));
        assertEquals(expected, permutations);
    }


    @Test
    public void getPermutations_shouldReturn_allPermutationsForFiveLetters() {
        WordPermutation wordPermutation = new WordPermutation();
        Set<String> permutations = wordPermutation.init("AbcDe");

        Set<String> expected = new HashSet<>(asList("ABcDE", "ABcDe", "AbcDE", "AbcDe", "ABCDE", "ABCDe", "AbCDE", "AbCDe"));
        assertEquals(expected, permutations);
    }
}