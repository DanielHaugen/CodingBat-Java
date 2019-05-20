/*
    Given a non-empty array of ints, return a new array containing the elements from the original array that come after the last 4 in the original array. 
    The original array will contain at least one 4. Note that it is valid in java to create an array of length 0.

    post4([2, 4, 1, 2]) → [1, 2]
    post4([4, 1, 4, 2]) → [2]
    post4([4, 4, 1, 2, 3]) → [1, 2, 3]
*/

public int[] post4(int[] nums) {
    if(nums.length < 1) return new int[]{};
    
    List<Integer> list = new ArrayList<Integer>();
    for(int k: nums) list.add(k);
    int index = list.lastIndexOf(4);
    
    int[] newNums = new int[nums.length-(index)-1];
    for(int k = index+1; k<nums.length;k++){
      newNums[k-index-1] = nums[k];
    }
    
    return newNums;
}  