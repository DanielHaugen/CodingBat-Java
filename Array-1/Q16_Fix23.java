/*
    Given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the 3 element to 0. Return the changed array.

    fix23([1, 2, 3]) → [1, 2, 0]
    fix23([2, 3, 5]) → [2, 0, 5]
    fix23([1, 2, 1]) → [1, 2, 1]
*/

public int[] fix23(int[] nums) {
    for(int k = 0;k<nums.length-1;k++){
      if(nums[k]==2 && nums[k+1]==3) nums[k+1] = 0;
    }
    return nums;
}  