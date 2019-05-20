/*
    Given an array of ints, return true if the number of 1's is greater than the number of 4's

    more14([1, 4, 1]) → true
    more14([1, 4, 1, 4]) → false
    more14([1, 1]) → true
*/

public boolean more14(int[] nums) {
    int count1s = 0;
    int count4s = 0;
    
    for(int k : nums){
      if(k == 1) count1s++;
      else if(k == 4) count4s++;
    }
    
    return count1s > count4s;   
}  