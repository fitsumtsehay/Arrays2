/* *create an empty variable. (sum)
Initialize it with 0 in a loop.
go through each element
add each element to sum.
Print sum.

 */
import java.util.Scanner;
public class Arrays2 {
    public static void main(String[] args)
    // Create an array to hold the numbers 1-10
    {
        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        /*begin loop, sum the numbers*/

        for (int num : ints) {
            sum = sum + num;
        }
        /* print output*/
        System.out.println("The total number is " + sum);

        // Get 10 number inputs from the user, store them in an array

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 10 numbers one by one:");
        int[] array = new int[10];
        int i;
        int sum2=0;
        for (i = 0; i < 10; i += 1) {
            array[i] = input.nextInt();

            sum2 = sum2 + array[i];

        }
        System.out.println("The total sum is: " + sum2);

//  the average of those 10 numbers

        System.out.println("The average is "+sum2/10);

// array to store 3 names, loop through that array to print out the names
        {
            String[] names = {"John", "David", "Chris"};

            for (int n = 0; n < names.length; n++) {

                System.out.println(names[n]);
            }


        }

// Loop through the following array and print out the index each time the value equals 5.
        {
            int[ ] numbers = {2, 5, 9, 0, 2, 1, 8, 5, 4};
            int key = 5;

            int x = 0;
            boolean found = false;    // set the boolean value to false until the key is found

            for ( x = 0; x < numbers.length; x++)
            {
                if (numbers[ x ]  == key)
                {
                    found = true;
                    if (found)   //When found is true, the index of the location of key will be printed.

                        System.out.println("Found the number 5 at the following index: " +x);
                }
            }
// Print the numbers 1-10 backwards

            int[] back = {1,2,3,3,4,5,6,7,8,9,10};
            for (int n = back.length-1; i>=0; i--) {
                System.out.println(" Backwards printed: " +back[i]);  } // backwards printed



        }}}