package com.rajadhi.code;

import java.util.HashSet;
import java.util.Set;

public class WordPermutation {

    public Set<String> init(String input) {
        return getPermutations(input);
    }


    //Ab
    public Set<String> getPermutations(String input) {
        Set<String> output = new HashSet<>();

        if (input.length() == 1) {
            if (Character.isLowerCase(input.charAt(0))) {
                output.add("" + Character.toUpperCase(input.charAt(0)));
            }
            output.add("" + input.charAt(0));
        } else {

            Set<String> subsequentPermutations = getPermutations(input.substring(1));

            for (String s : subsequentPermutations) {
                if (Character.isLowerCase(input.charAt(0))) {
                    output.add("" + Character.toUpperCase(input.charAt(0)) + s);
                }
                output.add("" + input.charAt(0) + s);
            }

        }
        return output;
    }
}
