/*
    Return an array that contains exactly the same numbers as the given array, 
    but rearranged so that every 3 is immediately followed by a 4. Do not move the 3's, 
    but every other number may move. The array contains the same number of 3's and 4's, 
    every 3 has a number after it that is not a 3, and a 3 appears in the array before any 4.

    fix34([1, 3, 1, 4]) → [1, 3, 4, 1]
    fix34([1, 3, 1, 4, 4, 3, 1]) → [1, 3, 4, 1, 1, 3, 4]
    fix34([3, 2, 2, 4]) → [3, 4, 2, 2]
*/

public int[] fix34(int[] nums) {
    int k = 0;
    
    while(k < nums.length && nums[k] != 3)
        k++;
    
    int j = k + 1;
    while(j < nums.length && nums[j] != 4)
        j++;
        
    while(k < nums.length) {
      if(nums[k] == 3) {
        int temp = nums[k+1];
        nums[k+1] = nums[j];
        nums[j] = temp;
        
        while(j < nums.length && nums[j] != 4)
          j++;
      }
      k++;
    }
  
    return nums;
}  