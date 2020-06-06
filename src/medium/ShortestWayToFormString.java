package medium;

public class ShortestWayToFormString {
    public static void main(String[] args) {

    }

    public int shortestWay(String source, String target) {
        int num = 0;
        String remaining = target;
        while (remaining.length() > 0) {
            int i = 0;
            int j = 0;
            StringBuilder subSequence = new StringBuilder();
            while (i < source.length() && j < remaining.length()) {
                if (source.charAt(i++) == remaining.charAt(j)) {
                    subSequence.append(remaining.charAt(j++));
                }
            }
            if (subSequence.length() == 0) {
                return -1;
            }
            num++;
            remaining = remaining.substring(subSequence.length());
        }
        return num;
    }

}