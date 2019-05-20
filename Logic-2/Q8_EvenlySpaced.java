/*
    Given three ints, a b c, one of them is small, one is medium and one is large. 
    Return true if the three values are evenly spaced, so the difference between small and medium is the same as the difference between medium and large.

    evenlySpaced(2, 4, 6) → true
    evenlySpaced(4, 6, 2) → true
    evenlySpaced(4, 6, 3) → false
*/

public boolean evenlySpaced(int a, int b, int c) {
    
    int min = Math.min(Math.min(a, b), c);
    int mid = Math.max(Math.min(a, b), c);
    int mid2 = Math.min(Math.max(a, b), c);
    int max = Math.max(Math.max(a, b), c);

    return Math.abs(mid - min) == Math.abs(mid - max) || 
           Math.abs(mid2 - min) == Math.abs(mid2 - max); 
}  