package service;

public class CapitalizeStringsImpl implements CapitalizeStrings{
    /**
     * ToUpper
     * @param word1
     * @param word2
     * @param word3
     * @param word4
     * @param word5
     * @param word6
     * @param word7
     * @return Concatenation of all params with upper strings
     */
    @Override
    public String toUpper(String word1, String word2, String word3, String word4, String word5, String word6,
                          String word7) {
        CapitalizeStrings func = (w1, w2, w3, w4, w5, w6, w7) -> w1.toUpperCase() + w2.toUpperCase() +
                w3.toUpperCase() + w4.toUpperCase() + w5.toUpperCase() + w6.toUpperCase() + w7.toUpperCase();

        return func.toUpper(word1, word2, word3, word4, word5, word6, word7);
    }
}
