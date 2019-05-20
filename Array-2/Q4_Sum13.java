/*
    Return the sum of the numbers in the array, returning 0 for an empty array. 
    Except the number 13 is very unlucky, so it does not count and numbers that come immediately after a 13 also do not count.

    sum13([1, 2, 2, 1]) → 6
    sum13([1, 1]) → 2
    sum13([1, 2, 2, 1, 13]) → 6
*/

public int sum13(int[] nums) {
    int sum = 0;
    boolean just13 = false;
    
    for(int k : nums){
      if(!just13){
        if(k!=13)sum+=k;
        else just13 = true;
      }else
        just13 = false;
    }
    
    return sum;
}  