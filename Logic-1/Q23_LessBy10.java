/*
    Given three ints, a b c, return true if one of them is 10 or more less than one of the others.

    lessBy10(1, 7, 11) → true
    lessBy10(1, 7, 10) → false
    lessBy10(11, 1, 7) → true
*/

public boolean lessBy10(int a, int b, int c) {
    int min = Math.min(a,Math.min(b,c));
    int max = Math.max(a,Math.max(b,c));
    
    return max-min>=10;
}  