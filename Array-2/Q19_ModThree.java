/*
    Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other.

    modThree([2, 1, 3, 5]) → true
    modThree([2, 1, 2, 5]) → false
    modThree([2, 4, 2, 5]) → true
*/

public boolean modThree(int[] nums) {
    int oddCount = 0, evenCount = 0;
    
    for(int k : nums){
      if(k%2 == 0){
        evenCount++;
        oddCount = 0;
      } else{
        oddCount++;
        evenCount = 0;
      }
      
      if(oddCount==3 || evenCount==3) return true;
    }
    
    return false;
}  