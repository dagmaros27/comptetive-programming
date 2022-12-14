class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> index = new LinkedList<>();
        for(int i=0;i<nums.length;i++){
            Arrays.sort(nums);
            if(nums[i] == target)
                index.add(i);
        }
           return index;
    }
}
