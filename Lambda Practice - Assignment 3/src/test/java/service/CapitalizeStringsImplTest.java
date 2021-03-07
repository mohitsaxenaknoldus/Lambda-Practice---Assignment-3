package service;

import static org.junit.Assert.*;

public class CapitalizeStringsImplTest {

    @org.junit.Test
    public void toUpper() {
        final String word1 = "The";
        final String word2 = "lambda";
        final String word3 = "has";
        final String word4 = "too";
        final String word5 = "many";
        final String word6 = "string";
        final String word7 = "arguments";

        CapitalizeStringsImpl capitalizeStrings = new CapitalizeStringsImpl();
        String result = capitalizeStrings.toUpper(word1, word2, word3, word4, word5, word6, word7);
        assertEquals(result, "THELAMBDAHASTOOMANYSTRINGARGUMENTS");
    }
}