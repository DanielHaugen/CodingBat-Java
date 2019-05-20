/*
    Given an array of ints, return true if every element is a 1 or a 4.

    only14([1, 4, 1, 4]) → true
    only14([1, 4, 2, 4]) → false
    only14([1, 1]) → true
*/

public boolean only14(int[] nums) {
    for(int k = 0; k < nums.length; k++)
      if(nums[k] != 1 && nums[k] != 4) return false;
    
    return true;
}  