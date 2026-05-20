class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        // Step 1: Added new interval to new double array newIntervals
        int[][] newIntervals = new int[intervals.length + 1][];
        boolean added = false;
        int counter = 0;
        for (int i = 0; i < newIntervals.length; i++) {
            if (counter < intervals.length) {
                if (newInterval[0] < intervals[counter][0] && !added) {
                    newIntervals[i] = newInterval;
                    added = true;
                    continue;
                }
                newIntervals[i] = intervals[counter];
                counter++;
            }
        }
        // If not added post loop, then add new interval to end of newIntervals array
        if (!added) {
            newIntervals[counter] = newInterval;
        }
        // Step 2: Merge intervals in new double array newIntervals
        int cur = 0;
        for (int i = 1; i < newIntervals.length; i++) {
            if (newIntervals[cur][1] >= newIntervals[i][0]) {
                newIntervals[cur][1] = Math.max(newIntervals[cur][1], newIntervals[i][1]);
            } else {
                cur++;
                newIntervals[cur] = newIntervals[i];
            }
        }
        return Arrays.copyOfRange(newIntervals, 0, cur + 1);
    }
}
