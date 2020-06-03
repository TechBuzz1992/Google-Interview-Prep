package easy;

import java.util.*;

public class FlipGame {
    public static void main(String[] args) {

    }

    public List<String> getAllFlips(String str) {
        int i = 0;
        List<String> possibleStates = new ArrayList<>();
        while (i < str.length()) {
            int nextMove = i == 0 ? str.indexOf("++") : str.indexOf("++", i);
            if (nextMove == -1) {
                return possibleStates;
            }

            String nextState = str.subSequence(0, nextMove) + "--" + str.substring(nextMove);

            possibleStates.add(nextState);

            i = nextMove + 1;

        }

        return possibleStates;

    }

}