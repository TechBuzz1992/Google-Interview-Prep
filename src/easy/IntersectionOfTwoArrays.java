package easy;

import java.util.*;
import java.util.stream.Collectors;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        List<Integer> n = new ArrayList<>();
        n.add(1);
        n.add(2);
        n.add(2);
        n.add(3);

        List<Integer> m = new ArrayList<>();
       // m.add(1);
        m.add(2);
        m.add(3);

        System.out.println(new IntersectionOfTwoArrays().getIntersect(n, m));

    }

    public List<Integer> getIntersect(List<Integer> n, List<Integer> m) {
        Set<Integer> ans = new HashSet<>();
        if (n == null || m == null) {
            return ans.stream().collect(Collectors.toList());
        }

        Set<Integer> setA = new HashSet<>();
        for (int i : n) {
            setA.add(i);
        }

        for (int i : m) {
            if (setA.contains(i)) {
                ans.add(i);
            }
        }

        return ans.stream().collect(Collectors.toList());
    }

}