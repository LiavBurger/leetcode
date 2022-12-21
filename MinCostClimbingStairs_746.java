public class MinCostClimbingStairs_746 {
    public int minCostClimbingStairs(int[] cost) {
        return minCheck(cost, cost.length);
    }

    private int minCheck(int[] cost, int n) {
        if (cost.length == 2)
            return Math.min(cost[0], cost[1]);

        return Math.min(cost[n] + minCheck(cost, n-2), minCheck(cost, n-1));
    }
}
