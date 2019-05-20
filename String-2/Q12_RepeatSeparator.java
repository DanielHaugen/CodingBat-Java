/*
    Given two strings, word and a separator sep, return a big string made of count occurrences of the word, separated by the separator string.

    repeatSeparator("Word", "X", 3) → "WordXWordXWord"
    repeatSeparator("This", "And", 2) → "ThisAndThis"
    repeatSeparator("This", "And", 1) → "This"
*/

public String repeatSeparator(String word, String sep, int count) {
    String str = "";
    
    if(count == 0) return "";
    else str += word;
    
    for(int k = 1; k < count; k++)
      str += sep+word;
    
    return str;
}