/*
    Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}. 
    You may modify and return the given array, or return a new array.

    shiftLeft([6, 2, 5, 3]) → [2, 5, 3, 6]
    shiftLeft([1, 2]) → [2, 1]
    shiftLeft([1]) → [1]
*/

public int[] shiftLeft(int[] nums) {
    if(nums.length<1) return new int[]{};
    
    List<Integer> list = new ArrayList<Integer>();
    for(int k = 1; k< nums.length;k++) list.add(nums[k]);
    list.add(nums[0]);
    
    for(int k = 0; k<nums.length;k++){
      nums[k] = list.get(k);
    }
    
    return nums;
}