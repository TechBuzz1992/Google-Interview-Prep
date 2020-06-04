package easy;

import java.util.*;

public class MostCommonWord {
    public static void main(String[] args) {

    }

    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> bannedWords = new HashSet<>();
        for (String word : banned) {
            bannedWords.add(word);
        }

        Map<String, Integer> count = new HashMap<>();
        for (String word : paragraph.replaceAll("^a-zA-Z", " ").toLowerCase().split(" ")) {
            count.put(word, count.getOrDefault(word, 0) + 1);

        }

        String result = "";

        for (String word : count.keySet()) {
            if (result == "" || count.get(word) > count.get(result)) {
                result = word;
            }
        }

        return result;
    }

}