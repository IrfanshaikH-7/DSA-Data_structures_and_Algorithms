package _3_sortAnArray;
    //NOTE: unComment commented code for visual understanding on terminal on how things working
public class _3_sortAnArray {

    public static void sortItem(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {          //two loops for comparing an element with its successor
            for (int j = i+1; j < arr.length; j++) {    //swaping elements prior with latter if prior is lessthen latter 
                if(arr[i]>arr[j]){
                    // System.out.print(arr[i]+ " at "+i + " | "+ arr[j]+ " at "+ j);
                    // System.out.println();
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    // System.out.print(arr[i]+ " at "+i + " | "+ arr[j]+ " at "+ j);
                    // System.out.println();
                    
                }
                /*else{
                     System.out.println("Skipped indexes: " +arr[i]+ " at "+i + " | "+ arr[j]+ " at "+ j);
                     System.out.println();
                }
                System.out.println("--- inner Loop end ---");
                System.out.println("----------");
                System.out.println(arr[i]+ " at -> "+ i);
                System.out.println("----------");*/
            }

        }
        System.out.print("Sorted Array: ");
        for (int i = 0; i < arr.length; i++) {
                       
                       System.out.print(arr[i]+ " ");
        }
        
    }

    public static void main(String args[]) {
        int[] arr = { 1, 6,2,0,7,3};

        sortItem(arr);
    }
}
