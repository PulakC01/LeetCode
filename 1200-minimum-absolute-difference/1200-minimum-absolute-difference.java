class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> l = new ArrayList<>();
        int min = 99999;

        Arrays.sort(arr);

        for (int i = 0; i+1<arr.length; ++i) {
          int diff = arr[i + 1] - arr[i];
          if (diff < min) {
            min = diff;
            l.clear();
          }
          if (diff == min)
            l.add(Arrays.asList(arr[i], arr[i + 1]));
        }
        return l;
    }
}