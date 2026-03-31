class MaxDiffSubarrays {
    public int maxDifference(int[] arr, int k) {
        int n = arr.length;
        int result = 0;

        for (int i = 0; i <= n - k; i++) {
            int max = arr[i], min = arr[i];
            for (int j = i; j < i + k; j++) {
                max = Math.max(max, arr[j]);
                min = Math.min(min, arr[j]);
            }
            result += (max - min);
        }

        return result;
    }
}
