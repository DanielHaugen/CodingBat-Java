/*
    Given an array of ints, return true if it contains no 1's or it contains no 4's.

    no14([1, 2, 3]) → true
    no14([1, 2, 3, 4]) → false
    no14([2, 3, 4]) → true
*/

public boolean no14(int[] nums) {
    boolean hasOnes = false, hasFours = false;
    
    if(nums.length < 2) return true;
    
    for(int k : nums){
      if(k == 1) hasOnes = true; 
      if(k == 4) hasFours = true;
    }
    
    return (hasOnes && !hasFours) || (!hasOnes && hasFours);
}  