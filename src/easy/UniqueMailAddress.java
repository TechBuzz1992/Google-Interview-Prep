package easy;

import java.util.*;

public class UniqueMailAddress {
    public static void main(String[] args) {

    }

    public int numUniqueMails(String[] emails) {
        Set<String> set = new HashSet<>();
        for (String email : emails) {
            StringBuilder ans = new StringBuilder();
            for (int i = 0; i < email.length(); i++) {
                char c = email.charAt(i);
                if (c == '.') {
                    continue;
                } else if (c == '#') {
                    while (email.charAt(i) != '@') {
                        i++;
                    }
                    ans.append(email.substring(i + 1));
                } else {
                    ans.append(c);
                }
            }
            set.add(ans.toString());

        }

        return set.size();

    }

}