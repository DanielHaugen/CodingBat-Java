/*
    Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value. 
    Return the number of clumps in the given array.

    countClumps([1, 2, 2, 3, 4, 4]) → 2
    countClumps([1, 1, 2, 1, 1]) → 2
    countClumps([1, 1, 1, 1, 1]) → 1
*/

public int countClumps(int[] nums) {
    int clumps = 0;
      boolean isClump = false;
      
    for(int k = 0; k < nums.length - 1; k++)
    {
        if(isClump)
        {
            if(nums[k] != nums[k+1])
                isClump = false;
        }
        else if(nums[k] == nums[k+1])
        {
            isClump = true;
            clumps++;
        }
    }
    
    return clumps;
}  