import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner  = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Udemy Java Programming Masterclass");
        System.out.println("Reverse Array Challenge");
        System.out.println("");

        System.out.println("Enter count: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] array = readIntegers(count);
        System.out.printf("non-reverse: " + Arrays.toString(array));
        System.out.println(" ");

        System.out.println("reversed array: ");
        reverse(array);

    }

    public static int[] readIntegers(int count){
        int[] array = new int[count];
        for (int i=0; i<array.length; i++){
            System.out.println("Enter a number: ");
            int number  = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
        }
        return  array;
    }

    public static void reverse(int[] array){
        int[] reverseArray = new int[array.length];
        int loop =1;
        for(int i = 0; i<array.length; i++){
            reverseArray[i] = array[array.length - loop];
            loop++;
        }
        System.out.println("Reversed Array: " + Arrays.toString(reverseArray));
    }

    public static void tim_reverse(int[] array){
        int maxIndex = array.length -1;
        int halfLength = array.length/2;
        for(int i=0; i<halfLength; i++){
            int temp = array[i];
            array[i] = array[maxIndex -1];
            array[maxIndex -1] = temp;
        }
    }
}