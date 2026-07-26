class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) 
            return new int[0][0];
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        int[] current = intervals[0];
        List<int[]> ans = new ArrayList<>();
        for(int i = 1; i < intervals.length; i++){
            int curEnd = current[1];
            int nextStart = intervals[i][0];
            int nextEnd = intervals[i][1];
            if (curEnd >= nextStart){
                current[1] = Math.max(curEnd, nextEnd);
            }
            else{
                ans.add(current);
                current = intervals[i];
            }
        }
        ans.add(current);
        return ans.toArray(new int[ans.size()][2]);
    }
}