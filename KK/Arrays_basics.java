package KK;
import java.util.Scanner;
public class Arrays_basics {
public static void main(String[] args) {

    //seperate decl & ini steps
    int arr3[]; //declaration of arrays
    arr3 = new int[3]; // Initialization of memory space

    // declaring and initializing an array of integers with size 4.
    int[] arr = new int[4];
    // or directly
    int arr2[]= {1,2,3,4};

    System.err.println(arr[0]); //prints initial value null/0

    // assigning values to array elements
    arr[0] = 10;
    System.err.println(arr[0]); //prints assigned value

    System.err.println(arr); //prints garbage 
    
    // Taking array values from user
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter 4 Array input values:");
    for (int j=0; j < arr.length; j++) {
        arr[j]= scanner.nextInt();
    }

    // printing the array
    for (int i=0; i < arr.length; i++) {
        System.err.print(arr[i] + " "); 
    }
    // usin enhanced for loop/ for-each loop
    for (int i : arr) {
        System.err.print(i); 
    }

 }

}
