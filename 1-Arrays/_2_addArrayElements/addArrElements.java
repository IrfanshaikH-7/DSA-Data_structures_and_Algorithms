package _2_addArrayElements;
import java.util.Scanner;


public class addArrElements {
    public static void main(String args[]){
        int[] arr = new int[6];
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        //loop for taking input
        for(int i=0; i<arr.length; i++){
            System.out.println("Enter number to add at index: ");
            arr[i] = sc.nextInt();
        }

        //loop for counting numbers
        for(int i=0; i<arr.length; i++){ 
            System.out.print('[');
            System.out.print(" "+ arr[i] + " ");
            System.out.print(']');
            System.out.print(" : ");
            sum+= arr[i];//same as ->  sum = sum + arr[i]; 
        }
        System.out.print(sum);
        

    }
}
