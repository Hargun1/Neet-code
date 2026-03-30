class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       HashMap<Integer , Integer> freq = new HashMap<>();
       for(int i = 0 ; i< nums.length ; i ++){
        freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
       }
          List<Integer>[] bucket = new List[nums.length + 1];

           for (int num : freq.keySet()) {
            int f = freq.get(num);
            if (bucket[f] == null) {
                bucket[f] = new ArrayList<>();
            }
            bucket[f].add(num);
        }
        int[] res = new int[k];
        int idx = 0;

        for (int i = bucket.length - 1; i >= 0; i--) {
    if (bucket[i] != null) {
        for (int num : bucket[i]) {
            if (idx == k) return res;
            res[idx++] = num;
        }
    }
}
 return res;
        }
    }

