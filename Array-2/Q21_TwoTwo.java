/*
    Given an array of ints, return true if every 2 that appears in the array is next to another 2.

    twoTwo([4, 2, 2, 3]) → true
    twoTwo([2, 2, 4]) → true
    twoTwo([2, 2, 4, 2]) → false
*/

public boolean twoTwo(int[] nums) {
    boolean just2 = false;
    
    for(int k = 0; k<nums.length-1; k++){
      if(nums[k]==2){
        if(nums[k+1] != 2 && !just2) 
            return false;
        just2 = true;
      } else just2 = false;
    }
    
    if(nums.length>0 && nums[nums.length-1]==2 && !just2) return false;
    
    return true;
}  