package easy;

public class JewelsAndStones {
    public static void main(String[] args) {
        String j = "aA";
        String s = "aaAbbb";

        System.out.println(new JewelsAndStones().getJewelsAndStones(j, s));

    }

    public int getJewelsAndStones(String j, String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (j.indexOf(c) != -1) {
                count++;
            }

        }

        return count;
    }

}