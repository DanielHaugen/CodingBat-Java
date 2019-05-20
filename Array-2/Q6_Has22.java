/*
    Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.

    has22([1, 2, 2]) → true
    has22([1, 2, 1, 2]) → false
    has22([2, 1, 2]) → false
*/

public boolean has22(int[] nums) {
    boolean just2 = false;
    
    for(int k : nums){
      if(!just2){
        if(k==2)just2 = true;
      }else{
        if(k==2)return true;
        just2 = false;
      }
    }
    
    return false;
}  