/*
    Return true if the array contains, somewhere, three increasing adjacent numbers like .... 4, 5, 6, ... or 23, 24, 25.

    tripleUp([1, 4, 5, 6, 2]) → true
    tripleUp([1, 2, 3]) → true
    tripleUp([1, 2, 4]) → false
*/

public boolean tripleUp(int[] nums) {
    int count = 0;
    
    for(int k = 1;k<nums.length;k++){
      if(count==2) return true;
      
      if(nums[k]-nums[k-1] == 1) count++;
      else count = 0;
    }
    
    return count==2;
}  