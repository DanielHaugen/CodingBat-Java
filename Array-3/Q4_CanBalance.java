/*
    Given a non-empty array, return true if there is a place to split the array so that 
    the sum of the numbers on one side is equal to the sum of the numbers on the other side.

    canBalance([1, 1, 1, 2, 1]) → true
    canBalance([2, 1, 1, 2, 1]) → false
    canBalance([10, 10]) → true
*/

public boolean canBalance(int[] nums) {
    int first = 0, second = 0;
      
    for(int k = 0; k < nums.length; k++)
      second += nums[k];
    
    for(int k = 0; k <= nums.length - 2; k++) {
      first += nums[k];
      second -= nums[k];
      
      if(first == second)
        return true;
    }
    
    return false;
}  