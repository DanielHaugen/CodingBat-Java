/*
    Given two strings, base and remove, return a version of the base string where 
    all instances of the remove string have been removed (not case sensitive). 
    You may assume that the remove string is length 1 or more. Remove only 
    non-overlapping instances, so with "xxx" removing "xx" leaves "x".

    withoutString("Hello there", "llo") → "He there"
    withoutString("Hello there", "e") → "Hllo thr"
    withoutString("Hello there", "x") → "Hello there"
*/

public String withoutString(String base, String remove) {
    String str = "";
    int idx = base.toLowerCase().indexOf(remove.toLowerCase());
    
    while (idx != -1) {
        str += base.substring(0, idx);
        base = base.substring(idx + remove.length());
        idx = base.toLowerCase().indexOf(remove.toLowerCase());
    }
    str += base;
    
    return str;
}  