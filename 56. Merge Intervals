class Solution {
    public int[][] merge(int[][] intervals) {
        // sort array by starting index, using lambda expression
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        // use cur as current value of merged intervals
        int cur = 0;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[cur][1] >= intervals[i][0]) {
                // if ending index is greater than starting index of next interval, then able to be merged
                // take higher number to be the second index between both intervals
                // first index will be of cur since it is lower due to the array being sorted prior
                intervals[cur][1] = Math.max(intervals[cur][1], intervals[i][1]);
            } else {
                // if no merge, than move cur up and set to i index in loop (get up to date...)
                cur++;
                intervals[cur] = intervals[i];
            }
        }
        // copyOfRange(array, start, end): end is exclusive so + 1 is needed
        return Arrays.copyOfRange(intervals, 0, cur + 1);
    }
}
