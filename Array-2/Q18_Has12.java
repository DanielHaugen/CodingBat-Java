/*
    Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array.

    has12([1, 3, 2]) → true
    has12([3, 1, 2]) → true
    has12([3, 1, 4, 5, 2]) → true
*/

public boolean has12(int[] nums) {
  
    List<Integer> num = new ArrayList<Integer>();
    for(int k : nums) num.add(k);
    
    int indexOf1 = num.indexOf(1);
    int indexOf2 = num.lastIndexOf(2);
    
    return indexOf1!=-1 && indexOf2 > indexOf1;
}  