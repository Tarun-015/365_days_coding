// Write a Java code that takes as input a positive number (length of an array here), and two arrays of that length - one of integers and another of strings. The code must also take an integer and a String as input, and print the number of occurrences of the integer and the string in the integer array and the string array, respectively.

// Format of input:
// Length of the arrays
// Elements in the integer array (in separate lines)
// Element to count in the integer array
// Elements in the string array (in separate lines)
// Element to count in the string array

// Variables used in the code: 
// len - represents length of array
// s1 - represents an element to be counted for in Integer array 
// s2 - represents an element to be counted for in String array 


import java.util.*;
class ArrayExample <T>{
  T[] a;
  
// Constructor to initialize the array
    ArrayExample(T[] arr) {
        a = arr;
    }

    // Method to display array elements
    void display() {
        for (T element : a) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // Method to count occurrences of an element
    int elementCount(T x) {
        int count = 0;
        for (T element : a) {
            if (element.equals(x)) {
                count++;
            }
        }
        return count;
    }
}

public class ArrayObject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int len = sc.nextInt(); // Taking input for length of the arrays

        // Integer array input
        Integer[] x = new Integer[len];
        for (int i = 0; i < len; i++) {
            x[i] = sc.nextInt();
        }

        int s1 = sc.nextInt(); // Element to count in Integer array

        // Create object for Integer array
        ArrayExample<Integer> obj = new ArrayExample<>(x);

        // String array input
        String[] y = new String[len];
        for (int i = 0; i < len; i++) {
            y[i] = sc.next();
        }

        //String s2 = sc.next(); // Element to count in String array

        // Create object for String array
        ArrayExample<String> obj1 = new ArrayExample<>(y);

    String s2 = sc.next(); //Taking input for the value to be counted
    obj.display();
    System.out.println(obj.elementCount(s1));
    obj1.display();
    System.out.println(obj1.elementCount(s2));
  }
}