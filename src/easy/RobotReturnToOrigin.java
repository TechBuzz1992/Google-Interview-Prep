package easy;

public class RobotReturnToOrigin {
    public static void main(String[] args) {
        String str = "UDL";

        System.out.println(new RobotReturnToOrigin().isOriginReach(str));

    }

    public boolean isOriginReach(String str) {
        int horizontal = 0;
        int vertical = 0;
        for (char c : str.toCharArray()) {
            if (c == 'U') {
                vertical++;
            } else if (c == 'D') {
                vertical--;
            } else if (c == 'R') {
                horizontal++;
            } else if (c == 'L') {
                horizontal--;
            }

        }

        return horizontal == 0 && vertical == 0;
    }

}