import java.util.Arrays;

class CheapestFlightsWithinKStops {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        final int inf = 10000 * 101 + 1;
        int[][] f = new int[k + 2][n];
        for (int i = 0; i < k + 2; i++)
            Arrays.fill(f[i], inf);
        f[0][src] = 0;
        for (int t = 1; t <= k + 1; t++) {
            for (int[] flight : flights) {
                int j = flight[0], i = flight[1], cost = flight[2];
                f[t][i] = Math.min(f[t][i], f[t - 1][j] + cost);
            }
        }
        int ans = inf;
        for (int t = 1; t <= k + 1; t++)
            ans = Math.min(ans, f[t][dst]);

        return ans == inf ? -1 : ans;
    }
}