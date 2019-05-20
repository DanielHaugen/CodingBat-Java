/*
    Return a version of the given array where each zero value in the array is replaced by the largest odd value to the right of the zero in the array. 
    If there is no odd value to the right of the zero, leave the zero as a zero.

    zeroMax([0, 5, 0, 3]) → [5, 5, 3, 3]
    zeroMax([0, 4, 0, 3]) → [3, 4, 3, 3]
    zeroMax([0, 1, 0]) → [1, 1, 0]
*/

public int[] zeroMax(int[] nums) {
    int max;
      
      for(int k = 0; k < nums.length - 1; k++){
          if(nums[k] == 0){
              max = 0;
              for(int i = k + 1; i < nums.length; i++){
                  if(nums[i] > max && nums[i] % 2 == 1)
                      max = nums[i];
              }
              if(max != 0) nums[k] = max;
          }
      }
      
      return nums;
}  