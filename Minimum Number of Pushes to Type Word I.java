class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        int totalPushes = 0;
        for (int i = 0; i < n; i++) {
            int pushCost = (i / 8) + 1;  
            totalPushes += pushCost;
        }

        return totalPushes;
    }
}