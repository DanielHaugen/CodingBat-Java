/*
    Given an array of ints, is it possible to divide the ints into two groups, 
    so that the sum of one group is a multiple of 10, and the sum of the other 
    group is odd. Every int must be in one group or the other. Write a recursive 
    helper method that takes whatever arguments you like, and make the initial 
    call to your recursive helper from splitOdd10(). (No loops needed.)

    splitOdd10([5, 5, 5]) → true
    splitOdd10([5, 5, 6]) → false
    splitOdd10([5, 5, 6, 1]) → true
*/

public boolean splitOdd10(int[] nums){
    return sidesAreOdd10(nums, 0, 0, 0);
}
  
public boolean sidesAreOdd10(int[] nums, int i, int sum1, int sum2){
    
    if(i == nums.length)
        return (sum1 % 2 == 1 && sum2 % 10 == 0 || 
                sum2 % 2 == 1 && sum1 % 10 == 0);
    if(sidesAreOdd10(nums, i + 1, sum1 + nums[i], sum2))
        return true;
    
    return sidesAreOdd10(nums, i + 1, sum1, sum2 + nums[i]);
}