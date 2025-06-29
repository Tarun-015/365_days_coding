// Create an abstract class StringOperations that has the following abstract methods:
//     String reverse(String s)
//     int vowelCount(String s)

// Create StringReverse class that extends StringOperations class but defines only String reverse(String s) method. It reverses the string which is passed as parameter and returns the reversed string.
// Create UpdatedStrings class that extends StringReverse class and defines int vowelCount(String s) method.  It counts the vowels in the string which is passed as parameter and returns the count.

import java.util.*;
abstract class StringOperations{
  public abstract String reverse(String s);
  public abstract int vowelCount(String s);
}
//Fill the code here

// Intermediate class that implements only reverse method
class StringReverse extends StringOperations {
  @Override
  public String reverse(String s) {
    StringBuilder sb = new StringBuilder(s);
    return sb.reverse().toString();
  }

  // Not implementing vowelCount here, so it stays abstract
  public int vowelCount(String s) {
    throw new UnsupportedOperationException("Not implemented in StringReverse");
  }
}

// Final class that completes the implementation
class UpdatedStrings extends StringReverse {
  @Override
  public int vowelCount(String s) {
    int count = 0;
    String lower = s.toLowerCase();
    for (int i = 0; i < lower.length(); i++) {
      char ch = lower.charAt(i);
      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        count++;
      }
    }
    return count;
  }
}

class Example {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    UpdatedStrings str = new UpdatedStrings();
    System.out.println("Reverse of "+ s + " is "+ str.reverse(s));
    System.out.println("Vowel count of "+ s + " is "+ str.vowelCount(s));
  }
}