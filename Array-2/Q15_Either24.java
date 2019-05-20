/*
    Given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4, but not both.

    either24([1, 2, 2]) → true
    either24([4, 4, 1]) → true
    either24([4, 4, 1, 2, 2]) → false
*/

public boolean either24(int[] nums) {
    boolean just2 = false, just4 = false;
    boolean pair2 = false, pair4 = false;
    
    for(int k : nums){
      if(!just2){
        if(k==2) just2 = true;
      }else{
        if(k==2) pair2 = true;
        just2 = false;
      }
      
      if(!just4){
        if(k==4) just4 = true;
      }else{
        if(k==4) pair4 = true;
        just4 = false;
      }
    }
    
    return (pair2 && !pair4) || (pair4 && !pair2);
}  