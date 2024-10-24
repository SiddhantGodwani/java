package KK;

import java.util.Scanner;
import java.util.Arrays;


public class String_Array{
public static void main(String[] args) {

    //seperate decl & ini steps
    String arr3[]; //declaration of arrays
    arr3 = new String[3]; // Initialization of memory space

    // declaring and initializing an array of Stringegers with size 4.
    String[] arr = new String[4];
    // or directly
    String arr2[]= {"a", "b", "c", "d"};

    System.err.println(arr[0]); //prints initial value null/0

    // assigning values to array elements
    arr[0] = "SYD";
    System.err.println(arr[0]); //prints assigned value

    System.err.println(arr); //prints garbage 
    
    // Taking array values from user
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter 4 Array input values:");
    for (int i=0; i < arr.length; i++) {
        arr[i]= scanner.next();
    }
    
    
    //using string builder
    System.out.println(Arrays.toString(arr));
    System.out.println(Arrays.toString(arr2));

    // // printing the array
    // for (String i=0; i < arr.length; i++) {
    //     System.err.print(arr[i] + " "); 
    // }
    // // usin enhanced for loop/ for-each loop
    // for (String i : arr) {
    //     System.err.print(i); 
    // }


 }

}

