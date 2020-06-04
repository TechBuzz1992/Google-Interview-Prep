package easy;

public class PaintHouse {
    public static void main(String[] args) {
        int[][] costs = {
            {17,2,15},
            {3,13,15},
            {8,19,3}
        };

        System.out.println(new PaintHouse().costPaint(costs));

    }

    public int costPaint(int[][] costs){
        if(costs == null || costs.length == 0){
            return 0;
        }

        for(int i = 1;i<costs.length;i++){
            costs[i][0] += Math.min(costs[i-1][1],costs[i-1][2]);
            costs[i][1] += Math.min(costs[i-1][0],costs[i-1][2]);
            costs[i][2] += Math.min(costs[i-1][1],costs[i-1][0]);

        }

        return Math.min(Math.min(costs[costs.length-1][0],costs[costs.length-1][1]),costs[costs.length-1][2]);




    }

}