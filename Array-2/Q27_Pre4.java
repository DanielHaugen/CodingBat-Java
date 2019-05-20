/*
    Given a non-empty array of ints, return a new array containing the elements from the original array that come before the first 4 in the original array. 
    The original array will contain at least one 4. Note that it is valid in java to create an array of length 0.

    pre4([1, 2, 4, 1]) → [1, 2]
    pre4([3, 1, 4]) → [3, 1]
    pre4([1, 4, 4]) → [1]
*/

public int[] pre4(int[] nums) {
    if(nums.length < 1) return new int[]{};
    
    List<Integer> list = new ArrayList<Integer>();
    for(int k: nums) list.add(k);
    int index = list.indexOf(4);
    
    int[] newNums = new int[index];
    for(int k = 0; k<index;k++){
      newNums[k] = nums[k];
    }
    
    return newNums;
}  